package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList linkedList;

    @Test
    void testLinkedListHead() {
        linkedList = new LinkedList();

        assertNull(linkedList.head);
    }

    @Test
    void testAddOneNode() {
        linkedList = new LinkedList();

        assertNull(linkedList.head);

        linkedList.add(1);

        assertNotNull(linkedList.head);

        Node head = linkedList.head;

        assertEquals(1, head.data);
        assertNull(head.next);
    }

    @Test
    void testAddTwoNodes() {
        linkedList = new LinkedList();

        assertNull(linkedList.head);

        linkedList.add(1);

        assertNotNull(linkedList.head);

        Node head = linkedList.head;

        assertEquals(1, head.data);
        assertNull(head.next);

        linkedList.add(2);

        assertNotNull(linkedList.head);
        assertNotNull(linkedList.head.next);

        head = linkedList.head;

        assertEquals(2, head.next.data);
        assertNull(head.next.next);
    }

    @Test
    void testLinkedListToString() {
        linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        String output = linkedList.toString();

        assertEquals("[ 1 2 3 ]", output);
    }

}