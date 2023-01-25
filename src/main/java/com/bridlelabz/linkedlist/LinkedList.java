package com.bridlelabz.linkedlist;

public class LinkedList {
    Node head;
    static class Node {
        int value;
        Node next;
        Node(int data) {
            value = data;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);
        linkedList.head.next = second;
        second.next = third;
        System.out.print("LinkedList: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
