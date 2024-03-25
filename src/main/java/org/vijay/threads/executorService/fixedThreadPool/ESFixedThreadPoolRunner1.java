package org.vijay.threads.executorService.fixedThreadPool;

import org.vijay.threads.executorService.MultiTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ESFixedThreadPoolRunner1 {

    public static void main(String[] args) {

        /*MultiTask mt1 = new MultiTask(1);
        mt1.run();
        MultiTask mt2 = new MultiTask(2);
        mt2.run();*/

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new MultiTask(1));
        es.execute(new MultiTask(2));
        es.execute(new MultiTask(3));
        es.execute(new MultiTask(4));
        es.execute(new MultiTask(5));
        es.shutdown();

    }
}
