package com.java7.problem.easy.linkedlist;

/**
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */

public class RemoveNodeFromEndList {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        if (n == size) {
            return head.next;
        }

        int nodeToRemovePos = size - n;

        ListNode before, after;
        before = after = null;
        current = head;

        for (int loop = 1; loop <= size; loop++) {
            if (loop == nodeToRemovePos)
                before = current;
            if (loop == nodeToRemovePos + 2)
                after = current;
            current = current.next;
        }
        before.next = after;
        return head;

    }
}