package com.java7.problem.easy.linkedlist;

public class DesignDoublyLinkedList {
    
    ListNode head;
    int size;

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public DesignDoublyLinkedList() {

    }

    public int get(int index) {
        if (index > size)
            return -1;

        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null && count != index) {
            currentNode = currentNode.next;
            count++;
        }
        return currentNode == null ? -1 : currentNode.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        if(head != null)
            head.prev = node;
        head = node;
        size++;        
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        ListNode node = new ListNode(val);
        node.prev = currentNode;
        currentNode.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        int count = 1;
        ListNode currentNode = head;
        while (count < index) {
            currentNode = currentNode.next;
            count++;
        }
        ListNode node = new ListNode(val);
        ListNode next = currentNode.next;
        currentNode.next = node;
        node.prev = currentNode;
        node.next = next;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size)
            return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        int count = 1;
        ListNode currentNode = head;
        while (count < index) {
            count++;
            currentNode = currentNode.next;
        }
        ListNode nextNode = currentNode.next;
        currentNode.next = nextNode.next;
        nextNode.prev = currentNode;
        size--;
    }

    public static void main(String[] args) {
        DesignLinkedList obj = new DesignLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(2);
        obj.addAtTail(3);
        obj.addAtHead(4);
        obj.deleteAtIndex(0);
        obj.addAtIndex(2, 100);
        System.out.println(obj.get(0));
        System.out.println(obj.get(1));
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
    }
}
