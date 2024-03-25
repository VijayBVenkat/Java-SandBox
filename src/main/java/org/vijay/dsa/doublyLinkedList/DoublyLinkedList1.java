package org.vijay.dsa.doublyLinkedList;

class Node {
    Node prev;
    int data;
    Node next;

    public Node (int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

public class DoublyLinkedList1 {
    Node head;
    void printDoublyLinkedList () {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + "<-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

}

class Main {
    public static void main(String[] args) {
        DoublyLinkedList1 dll = new DoublyLinkedList1();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        dll.head = n1;
        n1.next = n2; n2.prev = n1;
        n2.next = n3; n3.prev = n2;

        dll.printDoublyLinkedList();
    }
}
