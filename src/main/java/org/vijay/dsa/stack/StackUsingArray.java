package org.vijay.dsa.stack;

public class StackUsingArray {

    private int top;
    private int[] arr;

    public StackUsingArray (int capacity) {
        this.top = -1;
        this.arr = new int[capacity];
    }

    public void push (int data) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }

    public int pop () {
        if (top < 0) {
            throw new RuntimeException("Stack is empty");
        } else {
            int retVal = arr[top];
            top--;
            return retVal;
        }
    }

    public int peek () {
        if (top < 0) {
            throw new RuntimeException("Stack is empty");
        } else {
            return arr[top];
        }
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public int size () {
        return top + 1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(2);

        stack.push(10);
        System.out.println(stack.peek());
        stack.pop();

        System.out.println(stack.peek());
        stack.pop();
    }

}
