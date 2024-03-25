package org.vijay.threads.executorService;

public class Task1 extends Thread {

    public void run() {

        System.out.println("Task1 - Extends Thread start");
        for (int i = 0; i < 5; i++) {
            System.out.println("Task1 - Extends Thread " + i);
        }
        System.out.println("Task1 - Extends Thread end");
    }
}
