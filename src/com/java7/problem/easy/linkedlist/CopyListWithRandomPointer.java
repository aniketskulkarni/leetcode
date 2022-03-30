package com.java7.problem.easy.linkedlist;

/**
 * A linked list of length n is given such that each node contains an additional
 * random pointer, which could point to any node in the list, or null.
 * 
 * Construct a deep copy of the list. The deep copy should consist of exactly n
 * brand new nodes, where each new node has its value set to the value of its
 * corresponding original node. Both the next and random pointer of the new
 * nodes should point to new nodes in the copied list such that the pointers in
 * the original list and copied list represent the same list state. None of the
 * pointers in the new list should point to nodes in the original list.
 * 
 * For example, if there are two nodes X and Y in the original list, where
 * X.random --> Y, then for the corresponding two nodes x and y in the copied
 * list, x.random --> y.
 * 
 * Return the head of the copied linked list.
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;

        // Insert between node
        while (curr != null) {
            Node duplicate = new Node(curr.val);
            duplicate.next = curr.next;
            curr.next = duplicate;
            curr = duplicate.next;
        }
        curr = head;

        // Linking the random pointer
        while (curr != null && curr.next != null) {
            Node duplicate = curr.next;
            Node randomLink = curr.random;
            if (randomLink != null) {
                duplicate.random = randomLink.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node duplicate = head.next;
        Node duplicateHead = duplicate;

        // Seprating the linkedlist
        while (curr != null && curr.next != null) {
            curr.next = curr.next.next;
            if (duplicate != null && duplicate.next != null) {
                duplicate.next = duplicate.next.next;
            }
            curr = curr.next;
            duplicate = duplicate.next;
        }
        return duplicateHead;
    }
}
