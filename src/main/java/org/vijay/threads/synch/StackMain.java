package org.vijay.threads.synch;

public class StackMain {

    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        int cnt = 5;

        System.out.println("Before push");
        new Thread(() -> {
            int counter = 0;
            while (++counter < cnt) {
                System.out.println("Pushed " + newStack.push(100));
            }
        }).start();

        System.out.println("After push/before pop");

        new Thread(() -> {
            int counter = 0;
            while (++counter < cnt) {
                System.out.println("Popped " + newStack.pop());
            }
        }).start();

        System.out.println("After pop \n");

    }


}
