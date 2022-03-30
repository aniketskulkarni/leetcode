package com.java7.problem.easy.linkedlist;

/**
 * Given the heads of two singly linked-lists headA and headB, return the node
 * at which the two lists intersect. If the two linked lists have no
 * intersection at all, return null.
 */

public class IntersectionTwoLinkedlist {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode listA = headA;
        int lenA = getListLength(listA);

        ListNode listB = headB;
        int lenB = getListLength(listB);

        int diff = 0;
        if (lenA > lenB) {
            diff = lenA - lenB;
            for (int loop = 0; loop < diff; loop++) {
                headA = headA.next;
            }
        } else {
            diff = lenB - lenA;
            for (int loop = 0; loop < diff; loop++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int getListLength(ListNode list) {
        int len = 0;
        while (list != null) {
            len++;
            list = list.next;
        }
        return len;
    }
}
