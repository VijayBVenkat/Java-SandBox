package org.vijay.threads;

class Product {
    int cnt=1;
    public synchronized void multiply () {
        cnt = cnt * 2;
    }
}

public class SyncDemo1  {

    public static void main(String[] args) throws Exception {

        Product p1 = new Product();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    p1.multiply();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    p1.multiply();
                }
            }
        });

        t1.start();
        t1.join();

        t2.start();
        t2.join();
        System.out.println(p1.cnt);

    }
}
