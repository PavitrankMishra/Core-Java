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
            if(size == 0) {
                return -1;
            }else {
                return head.data;
            }
        }

        int getLast() {
            if(size == 0) {
                return -1;
            } else {
                return tail.data;
            }
        }

        int getAt(int idx) {
            if(size == 0) {
                return -1;
            } else if(idx < 0 || idx > size) {
                System.out.println("Invalid Arguments");
                return -1;
            } else {
                Node current = head;
                for(int i=0;i<idx;i++) {
                    current = head.next;
                }
                return current.data;
            }
        }

        void removeLast() {
            if(size == 0 ){
                System.out.println("List is empty");
            } else if(size == 1){
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for(int i=0;i<size - 2;i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        void removeAt(int idx) {
            if(size == 0) {
                System.out.println("List ia empty");
            } else if(idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
            } else {
                Node current = head;
                Node prev = null;
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
        System.out.println();
        ll1.printList();
        System.out.println();
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.getAt(5));
        System.out.println();
        ll1.removeLast();
        ll1.printList();
        ll1.removeAt(5);
        System.out.println();
        ll1.printList();
    }
}
