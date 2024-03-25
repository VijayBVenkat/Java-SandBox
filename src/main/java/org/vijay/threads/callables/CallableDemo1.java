package org.vijay.threads.callables;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
    private int num;

    public MyCallable(int num) {
        this.num = num;
    }

    public Integer call() throws Exception {
        // Simulate a time-consuming task
        Thread.sleep(1000);
        return num * num;
    }
}

public class CallableDemo1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a Callable task
        Callable<Integer> task = new MyCallable(5);

        // Submit the task to the executor and get a Future object
        Future<Integer> future = executor.submit(task);

        System.out.println("Task submitted");

        try {
            // Wait for the task to complete and retrieve the result
            Integer result = future.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

