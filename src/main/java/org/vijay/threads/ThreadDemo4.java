package org.vijay.threads;

class Thread4 extends Thread {

//    public Thread4(String name) {
//        super(name);
//    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside thread " + Thread.currentThread() + " " + i);
        }
    }
}

class Thread5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside runnable thread " + Thread.currentThread() + " " + i);
        }
    }
}

public class ThreadDemo4 {

    public static void main(String[] args) {

//        System.out.println("Before thread start");
//        Thread t1 = new Thread4();
////        t1.setDaemon(true);
//        t1.start();
//        System.out.println("After thread start");

//        Thread t2 = new Thread(new Thread5(), "Runnable thread");
//        t2.start();

//        Runnable t3 = new Thread5();
//        t3.run();

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside runnable thread " + Thread.currentThread() + " " + i);
            }
        }, "Runnable thread");
        t4.start();

    }
}
