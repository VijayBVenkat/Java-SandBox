package org.vijay.threads.executorService;

public class ThreadRunner {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.start();

        Task2 t2 = new Task2();
        t2.run();
    }

}
