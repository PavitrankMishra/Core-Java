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

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            temp.next = head;
            head = temp;
            size++;
        }

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

        void addAt(int val, int idx) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            Node current = head;
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
            size++;
        }

        void printList() {
            Node current = head;
            if(size < 0) {
                System.out.println("List is empty");
            } else {
                while(current != null) {
                    System.out.print(current.data + "->");
                    current = current.next;
                }
                System.out.print("null");
            }
        }

        int getFirst() {
            return head.data;
        }

        int getLast() {
            return tail.data;
        }

        int getAt(int idx) {
            Node current = head;
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            return current.data;
        }

        void removeFirst() {
            Node current = head;
            head = head.next;
            size--;
        }

        void removeLast() {
            Node current = head;
            for(int i=0;i<size-2;i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            size--;
        }

        void removeAt(int idx) {
            Node current = head;
            Node prev = null;
            for(int i=0;i<idx;i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            size--;
        }

        int getSize() {
            return size;
        }

        private Node getNodeAt(int idx) {
            Node current = head;
            for(int i=0;i<idx;i++) {
                current = current.next;
            }
            return current;
        }

        void reverseDI() {
            int li = 0;
            int ri = size - 1;

            while(li<ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        int kthFromLast(int k) {
            Node s = head;
            Node f = head;

            for(int i=0;i<k;i++) {
                f = f.next;
            }

            while(f.next != null) {
                s = s.next;
                f = f.next;
            }
            return f.data;
        }

        int mid() {
            Node s = head;
            Node f = head;

            while(f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }

            return s.data;
        }

        LinkedList MergeTwoSortedLinkedList(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList ans = new LinkedList();
            while(one.next != null && two.next !=null) {
                if(one.data < two.data) {
                    ans.addLast(one.data);
                    one = one.next;
                } else {
                    ans.addLast(two.data);
                    two = two.next;
                }
            }

            while(one.next != null) {
                ans.addLast(one.data);
                one = one.next;
            }

            while(two.next != null) {
                ans.addLast(two.data);
                two = two.next;
            }

            return ans;
        }

        LinkedList InitialiseFromArray(int[] arr) {
            LinkedList al = new LinkedList();
            for(int val: arr) {
                al.addLast(val);
            }

            return al;
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
        ll1.printList();
        ll1.removeAt(4);
        System.out.println();
        ll1.printList();
        System.out.println(ll1.getLast());
        ll1.addFirst(10);
        ll1.printList();
        System.out.println();
        System.out.println(ll1.getSize());
        ll1.addAt(50,5);
        ll1.printList();
        System.out.println();
        ll1.reverseDI();
        ll1.printList();
        System.out.println();
        System.out.println(ll1.kthFromLast(4));
        System.out.println();
        System.out.println(ll1.mid());
        System.out.println();

        int[] a1 = new int[] {10,20,30,40,50,60,70};
        int[] a2 = new int[] {5,15,25,35,45,55};

        LinkedList ll5 = ll1.InitialiseFromArray(a1);
        LinkedList ll6 = ll1.InitialiseFromArray(a2);

        LinkedList res = ll1.MergeTwoSortedLinkedList(ll5,ll6);
        res.printList();
    }
}