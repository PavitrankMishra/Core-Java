package com.company;

public class LL1 {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        //        Add element to last position in linked list
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        //        Print the size of the linked list
        public int size() {
            return size;
        }

        //        Display the linked list
        public void display() {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data + " ");
        }

        //        Remove first element from the linkedlist
        public void removeFirst() {
            head = head.next;
            size--;
        }

        //        Get the first element from the linkedlist
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        //        Get the last element from the linked list
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        //        Get element at particular index from the linked list
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        //        Add element at first position from the linked list
        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        //        Add at index from the linked list
        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

        //             Remove last element
        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        //            Remove at index
        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        l1.addLast(60);
        System.out.println(l1.size());
        l1.display();
        l1.removeFirst();
        l1.display();
        System.out.println(l1.getFirst());
        l1.display();
        System.out.println(l1.getFirst());
        l1.display();
        System.out.println(l1.getLast());
        l1.display();
        System.out.println(l1.getAt(2));
        l1.display();
        l1.addFirst(10);
        l1.display();
        l1.addAt(2, 25);
        l1.display();
        l1.removeLast();
        l1.display();
        l1.removeAt(2);
        l1.display();
    }
}