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
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }

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

        void addAt(int val, int idx) {
            if (idx < 0 || idx > size) {
                throw new IllegalArgumentException("Invalid index");
            }
            if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node temp = new Node();
                temp.data = val;
                Node current = head;
                for (int i = 0; i < idx - 1; i++) {
                    current = current.next;
                }
                temp.next = current.next;
                current.next = temp;
                size++;
            }
        }

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }

        int getFirst() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }
            return head.data;
        }

        int getLast() {
            if (tail == null) {
                throw new IllegalStateException("List is empty");
            }
            return tail.data;
        }

        int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IllegalArgumentException("Invalid index");
            }
            Node current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }
            return current.data;
        }

        void removeFirst() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        }

        void removeLast() {
            if (head == null) {
                throw new IllegalStateException("List is empty");
            }
            if (size == 1) {
                head = tail = null;
            } else {
                Node current = head;
                for (int i = 0; i < size - 2; i++) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            size--;
        }

        void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IllegalArgumentException("Invalid index");
            }
            if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node current = head;
                for (int i = 0; i < idx - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                size--;
            }
        }

        int getSize() {
            return size;
        }

        private Node getNodeAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IllegalArgumentException("Invalid index");
            }
            Node current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }
            return current;
        }

        void reverseDI() {
            int li = 0;
            int ri = size - 1;

            while (li < ri) {
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
            if (k < 0 || k >= size) {
                throw new IllegalArgumentException("Invalid index");
            }
            Node s = head;
            Node f = head;

            for (int i = 0; i < k; i++) {
                f = f.next;
            }

            while (f.next != null) {
                s = s.next;
                f = f.next;
            }
            return s.data;
        }

        int mid() {
            Node s = head;
            Node f = head;

            while (f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }

            return s.data;
        }

        LinkedList InitialiseFromArray(int[] arr) {
            LinkedList al = new LinkedList();
            for (int val : arr) {
                al.addLast(val);
            }
            return al;
        }

        LinkedList MergeTwoSortedLinkedList(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList ans = new LinkedList();
            while (one != null && two != null) {
                if (one.data < two.data) {
                    ans.addLast(one.data);
                    one = one.next;
                } else {
                    ans.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                ans.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                ans.addLast(two.data);
                two = two.next;
            }

            return ans;
        }

        public static Node midNode(Node head, Node tail) {
            Node s = head;
            Node f = head;
            while (f != tail && f.next != tail) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }



        LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }

            Node middle = midNode(head, tail);
            LinkedList fsh = mergeSort(head, middle);
            LinkedList ssh = mergeSort(middle.next, tail);
            LinkedList res = MergeTwoSortedLinkedList(fsh, ssh);
            return res;
        }

        public void removeDuplicates() {
            LinkedList res = new LinkedList();

            while(this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if(res.size == 0 || res.tail.data != val) {
                    res.addLast(val);
                }
            }
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }

        public void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while(this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
            }

            if(odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if(odd.size > 0) {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else if(even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        public void kReverse(int k) {
            LinkedList prev = null;

            while(this.size > 0) {
                LinkedList curr = new LinkedList();

                if(this.size >= k) {
                    for(int i=0;i<k;i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val);
                    }
                } else {
                    int os = this.size;
                    for(int i=0;i<os;i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                }

                if(prev == null) {
                    prev = curr;
                } else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;
                }
            }

            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(9);
        ll1.addLast(7);
        ll1.addLast(5);
        ll1.addLast(3);
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(4);
        ll1.addLast(6);
        ll1.addLast(8);
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
        LinkedList sortedList = ll1.mergeSort(ll1.head, ll1.tail);
        System.out.println();
        System.out.println("Sorted List");
        sortedList.printList();
        System.out.println();
        System.out.println("Duplicates removed list: ");
        int[] a3 = new int[] {2,2,3,3,3,5,5,5,5,7};
        LinkedList ll7 = ll1.InitialiseFromArray(a3);
        ll7.removeDuplicates();
        ll7.printList();
        ll1.oddEven();
        ll1.printList();

        System.out.println();
        ll1.kReverse(2);
        ll1.printList();
    }
}