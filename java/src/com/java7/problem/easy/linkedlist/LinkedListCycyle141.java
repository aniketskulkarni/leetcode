/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 */

package com.java7.problem.easy.linkedlist;

/**
 * @author Aniket Kulkarni
 */


//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycyle141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        return slow == fast;
    }
}