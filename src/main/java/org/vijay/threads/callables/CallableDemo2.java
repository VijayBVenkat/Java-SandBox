package org.vijay.threads.callables;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

class SumCalculator implements Callable<Long> {
    private long start;
    private long end;

    public SumCalculator(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public Long call() {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

public class CallableDemo2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long n = 1000000000;
        int numThreads = 5; // Number of threads to use

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> futures = new ArrayList<>();

        long chunkSize = n / numThreads;
        long start = 1;
        long end = chunkSize;

        // Create and submit tasks to calculate sum in parallel
        for (int i = 1; i <= numThreads; i++) {
            Callable<Long> task = new SumCalculator(start, end);
            Future<Long> future = executor.submit(task);
            futures.add(future);
            start = end + 1;
//            end = (i == numThreads - 2) ? n : end + chunkSize;
            end = Math.min(end + chunkSize, n);
        }

        // Combine results from all threads
        long totalSum = 0;
        for (Future<Long> future : futures) {
            try {
                totalSum += future.get(); // Blocking call to get the result
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + totalSum);

        Long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        System.out.println("Time consumed: " + String.valueOf(diff));

        // Shutdown the executor
        executor.shutdown();
    }
}

