package com.company;

import java.util.*;
public class MultiAl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList();

//        Initialisation
        for(int j=0;j<3;j++) {
            list1.add(new ArrayList());
        }

//        Add Elements
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                list1.get(i).add(in.nextInt());
            }
        }
        System.out.println(list1);
    }
}
