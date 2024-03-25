package org.vijay.dsa.doublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList2 {

    ListNode head;
    ListNode tail;
    int length;
    private static class ListNode {
        ListNode prev;
        int data;
        ListNode next;
        public ListNode (int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList2() {
        ListNode head = null;
        ListNode tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void insertAtHead (int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        length++;
    }

    public ListNode deleteFirstNode () {
        System.out.println("Delete first node");
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (getLength() == 1) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        displayForward();
        return temp;
    }

    public ListNode deleteLastNode () {
        System.out.println("Delete last node");
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (getLength() == 1) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        length--;
        displayForward();
        return temp;
    }

    public static void main(String[] args) {

        DoublyLinkedList2 dll2 = new DoublyLinkedList2();

        dll2.insertAtLast(10);
        dll2.insertAtLast(20);
        dll2.insertAtLast(30);
        dll2.insertAtLast(40);
        dll2.insertAtHead(5);

//        dll2.head = new ListNode(10);
//        ListNode n2 = new ListNode(20);
//        ListNode n3 = new ListNode(30);
//        dll2.tail = new ListNode(40);
//        dll2.head.next = n2; n2.prev = dll2.head;
//        n2.next = n3; n3.prev = n2;
//        n3.next = dll2.tail; dll2.tail.prev = n3;

        dll2.displayForward();
        dll2.displayBackward();

        // Delete the first node
        dll2.deleteFirstNode();
        // Delete the last node
        dll2.deleteLastNode();

    }

    public void displayForward () {
        System.out.println("Display forward");
        if (head == null) {
            System.out.println("LL empty");
            return;
        }

        ListNode current = head;

        System.out.print("head-->");
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("tail");

    }

    public void displayBackward () {
        System.out.println("Display backward");
        if (tail == null) {
            System.out.println("LL empty");
            return;
        }

        ListNode current = tail;

        System.out.print("tail-->");
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("head");

    }

}
