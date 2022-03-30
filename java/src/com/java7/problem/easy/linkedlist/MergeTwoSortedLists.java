package com.java7.problem.easy.linkedlist;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * 
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Input: list1 = [], list2 = []
 * Output: []
 */

public class MergeTwoSortedLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode result = new ListNode(-1);
        ListNode mergeNode = result;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                mergeNode.next = l2;
                mergeNode = mergeNode.next;
                l2 = l2.next;
            } else {
                mergeNode.next = l1;
                mergeNode = mergeNode.next;
                l1 = l1.next;
            }
        }

        mergeNode.next = (l1 != null) ? l1 : l2;
        return result.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        ListNode l1 = obj.new ListNode(1);
        l1.next = obj.new ListNode(2);
        l1.next.next = obj.new ListNode(4);

        ListNode l2 = obj.new ListNode(1);
        l2.next = obj.new ListNode(3);
        l2.next.next = obj.new ListNode(4);

        obj.mergeTwoLists(l1, l2);
    }
}
