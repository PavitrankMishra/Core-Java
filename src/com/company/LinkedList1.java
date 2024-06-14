package com.company;

public class LinkedList1 {

    static class Node {
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void removeFirst() {
            Node current = head;
            head = head.next;
            size--;
        }

        void printList() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        int getFirst() {
            return head.data;
        }

        int getLast() {
            if(size == 0) {
                return tail.data;
            } else {
                Node current = head;
                while(current.next != null) {
                    current = current.next;
                }
                return current.data;
            }
        }

        int getAt(int idx) {
            Node current = head;
            if(size == 0) {
                return -1;
            } else if(idx < 0 || idx > size) {
                System.out.println("Invalid Arguments");
                return -1;
            }
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            return current.data;
        }

        void removeLast() {
            Node current = head;
            for(int i=0;i<size - 2;i++) {
                current = current.next;
            }
            current.next = null;
            current = tail;
            size--;
        }

        void removeAt(int idx) {
            if(size == 0) {
                System.out.println("No element");
            } else if(idx < 0 || idx > size) {
                System.out.println("Invalid Areguments");
            } else {
                Node prev = null;
                Node current = head;
                for(int i=0;i<idx;i++) {
                    prev = current;
                    current = current.next;
                }
                prev.next = current.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(4);
        ll1.addLast(5);
        ll1.addLast(6);
        ll1.addLast(7);
        ll1.addLast(8);
        ll1.addLast(9);
        ll1.printList();
        System.out.println();
        ll1.removeFirst();
        ll1.printList();
        System.out.println();
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.getAt(5));
        ll1.removeLast();
        System.out.println();
        ll1.removeAt(4);
        System.out.println();
        ll1.printList();
    }
}