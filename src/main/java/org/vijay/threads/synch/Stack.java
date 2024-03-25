package org.vijay.threads.synch;

public class Stack {

    private int[] array;
    private int stackTop;
    public Stack (int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }
    public boolean push(int stackVal) {
        // this is same as synchronized method (written for pop()
        // if the method is a static method
        // use, synchronized (Stack.class)
        synchronized (this) {
            if (isFull()) {
                return false;
            }
            ++stackTop;
            try {Thread.sleep(1000);} catch (Exception e) {}
            array[stackTop] = stackVal;
            return true;
        }
    }

    public synchronized int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int retVal = array[stackTop];
        array[stackTop] = -1;
        try {Thread.sleep(1000);} catch (Exception e) {}
        stackTop--;
        return retVal;
    }

    private boolean isFull() {
        return stackTop >= array.length - 1;
    }

    private boolean isEmpty() {
        return stackTop < 0;
    }
}
