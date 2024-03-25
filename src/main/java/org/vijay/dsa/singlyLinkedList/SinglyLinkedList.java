package org.vijay.dsa.singlyLinkedList;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class SinglyLinkedList {

    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        //Creating a normal object - which is a strong reference object
        SinglyLinkedList sll = new SinglyLinkedList();

        // Creating a weak reference object
//        WeakReference<SinglyLinkedList> sll = new WeakReference<SinglyLinkedList>(new SinglyLinkedList());

        // Creating a soft reference object
//        SoftReference<SinglyLinkedList> sll = new SoftReference<SinglyLinkedList>(new SinglyLinkedList());

//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode forth = new ListNode(11);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = forth;
//
//        sll.display();

//        sll.insertNodeAtStart(8);
//        sll.display();
//
//        sll.insertNodeAtEnd(20);
//        sll.display();

        sll.insertNodeAtPosition(3, 1);
        sll.insertNodeAtPosition(5, 2);
        sll.insertNodeAtPosition(2, 1);
        sll.insertNodeAtPosition(4, 2);
        sll.display();


    }

    public void display() {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
            ++length;
        }
        System.out.println("null");
        System.out.println("Length: " + length);
    }

    public void insertNodeAtStart (int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertNodeAtEnd (int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertNodeAtPosition (int val, int position) {
        ListNode newNode = new ListNode(val);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int cnt = 1;
            while (cnt < position - 1) {
                previous = previous.next;
                cnt++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }


}
