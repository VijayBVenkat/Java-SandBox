package org.vijay.dsa.singlyLinkedList;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList1 {
    Node head;
    void printSinglyLinkedList () {
        Node curr = head;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SinglyLinkedList1 sll = new SinglyLinkedList1();

        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        sll.head = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = new Node(50);


        sll.printSinglyLinkedList();
        System.out.println(sll.head.data);

    }
}
