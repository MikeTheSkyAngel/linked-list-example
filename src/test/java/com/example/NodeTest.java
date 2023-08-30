package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private Node node;

    @Test
    void testNode() {
        node = new Node(1);

        assertEquals(1, node.data);
        assertNull(node.next);
    }

    @Test
    void testNodeWithNextNode() {
        node = new Node(1);

        assertEquals(1, node.data);
        assertNull(node.next);

        Node nextNode = new Node(2);

        assertEquals(2, nextNode.data);
        assertNull(nextNode.next);

        node.next = nextNode;

        assertNotNull(node.next);
    }

}