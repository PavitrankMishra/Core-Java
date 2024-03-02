package com.company;

import java.util.*;
public class Listing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        Listing obj = new Listing();

//        Add elements in the list
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        list.set(1,"Dates");

        Collections.sort(list);
//        Printing the array list
        for(String c:list) {
            System.out.println(c);
        }

        ListIterator<String> itr = list.listIterator();
        System.out.println("Ierating in forward direction");
        while(itr.hasNext()) {
            System.out.println("index " + itr.nextIndex() + " value: " + itr.next());
        }
        System.out.println("Iterating in backward direction");
        while(itr.hasPrevious()) {
            System.out.println("index " + itr.previousIndex() + " value: " + itr.previous());
        }

        ArrayList<Integer> list2 = new ArrayList();
        list2.add(5);
        list2.add(4);
        list2.add(25);
        list2.add(1);
        list2.add(9);

        Collections.sort(list2);

        for(int i:list2) {
            System.out.println(i);
        }

        ListIterator<Integer> l2 = list2.listIterator();

        System.out.println("Iterating in foward direction: ");
        while(l2.hasNext()) {
            System.out.println("Index: " + l2.nextIndex() + " value: " + l2.next());
        }

        System.out.println("Iterating in backward direction");
        while(l2.hasPrevious()) {
            System.out.println("Index: " + l2.previousIndex() + " value: " + l2.previous());
        }
    }
}
