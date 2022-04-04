package com.java7.problem.medium.linkedlist;

/**
 * You are given the head of a linked list, and an integer k.
 * 
 * Return the head of the linked list after swapping the values of the kth node
 * from the beginning and the kth node from the end (the list is 1-indexed).
 * 
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [1,4,3,2,5]
 */
public class SwappingNodeLinkedList {
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

    // Time: O(n) : Space: O(1)
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length += 1;
            temp = temp.next;
        }

        temp = head;
        int endKNodePos = length - k + 1;
        int cnt = 1;

        ListNode kNode = null;
        ListNode endKNode = null;

        while (temp != null) {
            if (cnt == k) {
                kNode = temp;
            }
            if (cnt == endKNodePos) {
                endKNode = temp;
            }
            cnt += 1;
            temp = temp.next;
        }

        int t = kNode.val;
        kNode.val = endKNode.val;
        endKNode.val = t;

        return head;
    }
}
