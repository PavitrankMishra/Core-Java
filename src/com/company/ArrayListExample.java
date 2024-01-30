package com.company;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList(10);
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list.contains(654));
        System.out.println(list.contains(12));
        list.set(0, 66);
        list.remove(2);
        System.out.println(list);

//        input
        for(int i = 0;i< 5;i++) {
            list.add(in.nextInt());
        }

//        get item at any index
        for(int i=0;i<5;i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }

}
