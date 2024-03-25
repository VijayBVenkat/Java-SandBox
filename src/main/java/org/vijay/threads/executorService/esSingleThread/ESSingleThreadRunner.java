package org.vijay.threads.executorService.esSingleThread;

import org.vijay.threads.executorService.Task1;
import org.vijay.threads.executorService.Task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ESSingleThreadRunner {

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(new Task1());

        es.execute(new Thread(new Task2()));

        new Thread(() -> {
            System.out.println("Task3 - Main Thread start");
            for (int i = 0; i < 5; i++) {
                System.out.println("Task3 - Main Thread " + i);
            }
            System.out.println("Task3 - Main Thread end");
        }).start();

        es.shutdown();
    }
}
