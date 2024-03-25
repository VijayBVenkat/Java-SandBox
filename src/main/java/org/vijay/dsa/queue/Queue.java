package org.vijay.dsa.queue;

import java.util.List;

public class Queue {
    private ListNode frontNode;
    private ListNode rearNode;
    private int length;

    private class ListNode {
        int data;
        private ListNode next;

        private ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getLength () {
        return length;
    }

    public boolean isEmpty() {
        return length ==0;
    }

    public void enqueue (int data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            frontNode = newNode;
        } else {
            rearNode.next = newNode;
        }
        rearNode = newNode;
        length++;
    }

    public void dequeue () {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            int retVal = frontNode.data;
            frontNode = frontNode.next;
            if (frontNode == null) {
                rearNode = null;
            }
            length--;
            System.out.println("Dequeue: " + retVal);
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            return;
        } else {
            ListNode current = frontNode;
            System.out.println("Queue: ");
            while (current != null) {
                System.out.print(current.data + "-->");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            System.out.println("First Node: " + frontNode.data);
        }
    }

    public void getLast() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            System.out.println("Last Node: " + rearNode.data);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.printQueue();
        queue.getFirst();
        queue.getLast();
    }
}
