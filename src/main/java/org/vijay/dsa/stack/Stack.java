package org.vijay.dsa.stack;

public class Stack {
    ListNode top;
    int length = 0;
    private class ListNode {
        int data;
        ListNode next;
        public ListNode (int data) {
            this.data = data;
        }
    }

    public Stack () {
        top = null;
        length = 0;
    }

    public void push (int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek () {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    public int getLength () {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Peeked value: " + stack.peek());

        int popVal = stack.pop();
        System.out.println("Popped value; " + popVal);

        System.out.println("Peeked value after pop: " + stack.peek());
    }

}
