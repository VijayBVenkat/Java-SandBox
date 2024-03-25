package org.vijay.threads.callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// Note:
// This is exactly the same as CallableDemo2.java
// Re-did this as a practice.

class SumCalculator1 implements Callable <Long> {

    private long firstNum;
    private long secondNum;

    public SumCalculator1(long firstNum, long secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (long i = firstNum; i <= secondNum; i++) {
            sum += i;
        }
        return sum;
    }
}

public class CallableDemo21 {

    public static void main(String[] args) {

        long sumTill = 100000;
        int numThreads = 5;

        long start = 1;
        long chunk = sumTill / numThreads;
        long end = chunk;

        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Future<Long>> futuresList = new ArrayList<>();

        for (int i = 0; i < numThreads; i ++) {
            Callable<Long> task = new SumCalculator1(start, end);
            Future <Long> future = es.submit(task);
            futuresList.add(future);
            start = end + 1;
            end = Math.min(end + chunk, sumTill);
        }
        es.shutdown();
        long finalSum = 0;
        for (Future<Long> future : futuresList) {
            try {
                finalSum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(finalSum);
    }

}
