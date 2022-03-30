package com.java7.problem.easy.linkedlist;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

public class AddTwoNumbersLinkedList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // Initial approach
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode sumNode = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int addition = l1.val + l2.val + carry;
            if (addition > 9) {
                carry = 1;
                addition = addition % 10;
            } else {
                carry = 0;
            }

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int addition = l1.val + carry;
            if (addition > 9) {
                carry = 1;
                addition = addition % 10;
            } else {
                carry = 0;
            }

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l1 = l1.next;
        }

        while (l2 != null) {
            int addition = l2.val + carry;
            if (addition > 9) {
                carry = 1;
                addition = addition % 10;
            } else {
                carry = 0;
            }

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l2 = l2.next;
        }

        if (carry > 0) {
            sumNode.next = new ListNode(carry);
            sumNode = sumNode.next;
        }

        return result.next;
    }

    // Refactored approach
    public ListNode addTwoNumbersRefactor1(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode sumNode = result;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int addition = l1.val + l2.val + carry;
            carry = addition / 10;
            addition = addition % 10;

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int addition = l1.val + carry;
            carry = addition / 10;
            addition = addition % 10;

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l1 = l1.next;
        }

        while (l2 != null) {
            int addition = l2.val + carry;
            carry = addition / 10;
            addition = addition % 10;

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;

            l2 = l2.next;
        }

        if (carry > 0) {
            sumNode.next = new ListNode(carry);
            sumNode = sumNode.next;
        }

        return result.next;
    }

    // Refactor
    public ListNode addTwoNumbersRefactor2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode sumNode = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int addition = 0;
            if (l1 != null) {
                addition += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                addition += l2.val;
                l2 = l2.next;
            }

            addition += carry;
            carry = addition / 10;
            addition = addition % 10;

            sumNode.next = new ListNode(addition);
            sumNode = sumNode.next;
        }

        return result.next;
    }
}
