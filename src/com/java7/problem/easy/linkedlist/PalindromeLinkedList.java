package com.java7.problem.easy.linkedlist;

/**
 * Given the head of a singly linked list, return true if it is a palindrome.
 * 
 * Input: head = [1,2,2,1]
 * Output: true
 * 
 * Input: head = [1,2]
 * Output: false
 */

public class PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        slow = reverseList(slow);

        while (slow != null) {
            if (slow.val != head.val)
                return false;
            slow = slow.next;
            head = head.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode start) {
        ListNode prev = null;

        while (start != null) {
            ListNode next = start.next;
            start.next = prev;
            prev = start;
            start = next;
        }

        return prev;
    }
}