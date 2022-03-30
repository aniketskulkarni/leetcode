package com.java7.problem.easy.linkedlist;

/**
 * You are given a doubly linked list, which contains nodes that have a next
 * pointer, a previous pointer, and an additional child pointer. This child
 * pointer may or may not point to a separate doubly linked list, also
 * containing these special nodes. These child lists may have one or more
 * children of their own, and so on, to produce a multilevel data structure as
 * shown in the example below.
 * Given the head of the first level of the list, flatten the list so that all
 * the nodes appear in a single-level, doubly linked list. Let curr be a node
 * with a child list. The nodes in the child list should appear after curr and
 * before curr.next in the flattened list.
 * Return the head of the flattened list. The nodes in the list must have all of
 * their child pointers set to null.
 * 
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 * Explanation: The multilevel linked list in the input is shown.
 * After flattening the multilevel linked list it becomes:
 */

public class FlattenMultilevelDoublyLinkedList {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        Node curr = head;

        while (curr != null) {
            // continue till there is no child node
            if (curr.child == null) {
                curr = curr.next;
                continue;
            }

            // go to end of child list
            Node childNode = curr.child;
            while (childNode.next != null) {
                childNode = childNode.next;
            }

            // change end child's next to current next
            // and next node's prev to end node of child
            childNode.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = childNode;
            }

            // current next to child's head
            // child's prev to current
            curr.next = curr.child;
            curr.child.prev = curr;
            curr.child = null;
        }

        return head;
    }
}
