package org.vijay.threads.executorService;

public class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 - Implements Thread start");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task2 - Implements Thread " + i);
        }
        System.out.println("Task2 - Implements Thread end");
    }
}
