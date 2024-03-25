package org.vijay.threads.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class SerialMultiplier implements Callable<Long> {

    private long start;
    private long end;

    public SerialMultiplier(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long product = 1;
        for (long i = start; i <= end; i++) {
            product = product * i;
        }
        return product;
    }
}

public class CallableDemo3 {

    public static void main(String[] args) {

        long n = 50;
        int numThreads = 5;

        long start = 1;
        long chunkSize = n / numThreads;
        long end = chunkSize;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> futures = new ArrayList<>();

        for (int i = 0; i < numThreads; i++ ) {
            Callable<Long> task = new SerialMultiplier(start, end);
            Future<Long> future = executor.submit(task);
            futures.add(future);
            start = end + 1;
            end = (i == numThreads - 2) ? n : end + chunkSize;
        }

        long result = 1;
        for (Future<Long> l : futures) {
            try {
                result = result * l.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Product of 1 to " + n + " is " + result);
    }

}
