package com.example;

public class LinkedList {

    public Node head;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        Node current = head;
        while (current != null) {
            builder.append(current.data).append(" ");
            current = current.next;
        }
        builder.append("]");
        return builder.toString();
    }

}
