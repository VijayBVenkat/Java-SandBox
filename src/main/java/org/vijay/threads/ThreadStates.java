package org.vijay.threads;

public class ThreadStates {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(1);
                for (int i = 3; i > 0; i--);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "ThreadState");

        t1.start();

        while (true) {
            Thread.State state = t1.getState();
            System.out.println(state);
            if (state == Thread.State.TERMINATED) {
                break;
            }
        }
    }
}
