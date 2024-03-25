package org.vijay.threads.executorService;

public class MultiTask extends Thread {

    private int num;

    public MultiTask(int num) {
        this.num = num;
    }

    public void run() {

        System.out.println("Multi task - " + num + " start");
        int numTen =  num * 10;
        for (int i = numTen; i < numTen + 10; i++) {
//            System.out.println("Multi task - " + i);
        }
        System.out.println("Multi task - " + num + " end");
    }
}
