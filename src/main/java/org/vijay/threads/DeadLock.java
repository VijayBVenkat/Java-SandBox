package org.vijay.threads;

public class DeadLock {

    public static void main(String[] args) {

        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Lock acquired in thread1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Lock acquired in thread2");
                }
            }
        });

        System.out.println("Start");
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
