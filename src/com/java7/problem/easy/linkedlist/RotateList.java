package com.java7.problem.easy.linkedlist;

/**
 * Given the head of a linked list, rotate the list to the right by k places.
 * 
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 */

public class RotateList {

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

    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        ListNode last = head;
        int len = 1;
        while (last.next != null) {
            len += 1;
            last = last.next;
        }

        last.next = head;

        int rotation = k % len;

        int rotateFromNode = len - rotation;
        ListNode newHead = head;

        for (int i = 0; i < rotateFromNode - 1; i++) {
            newHead = newHead.next;
        }

        head = newHead.next;
        newHead.next = null;

        return head;
    }
}
