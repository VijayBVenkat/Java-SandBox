package org.vijay.threads;

import java.util.Random;

class Q {
    int num;
    boolean valueSet = false;

    public synchronized void setNum(int num) {

        while (valueSet) {
            try {wait();} catch (Exception e) {};
        }
        System.out.println("Set " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void getNum() {

        while (!valueSet) {
            try {wait();} catch (Exception e) {};
        }
        System.out.println("Get " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            q.setNum(i++);
            try {Thread.sleep(1000);} catch (Exception e) {};
        }
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer (Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.getNum();
            try {Thread.sleep(1000);} catch (Exception e) {};
        }
    }
}

public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
