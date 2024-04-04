package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
//      ArrayList<Integer> al = new ArrayList<Integer>();

//      Insert
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(1);
//
//        System.out.println("The size of the set is: " + set.size());
////      Print all elements
//        System.out.println(set);
//
////      SEARCH - CONTAINS
//        if(set.contains(1)) {
//            System.out.println("Set contains 1");
//        }
//        if(!set.contains(6)) {
//            System.out.println("Set does not contain 6");
//        }
//
//        //Delete
//        set.remove(1);
//        if(!set.contains(1)) {
//            System.out.println("Does not contain 1");
//        }
//
//        System.out.println("The size of set is: " + set.size());
//
////        Print all elements
//        System.out.println(set);
//
////        Iterator
//        Iterator it = set.iterator();
////        hasNext();
////        next();
//
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
//
////        country(key), population(value)
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//
////        Insertion
//        map.put("India", 120);
//        map.put("US", 30);
//        map.put("China", 150);
//
//        System.out.println(map);
//
//        map.put("China", 180);
//        System.out.println(map);
//
//
////        Search
//        if(map.containsKey("China")) {
//            System.out.println("Key is present in the map");
//        } else {
//            System.out.println("Key is not present in the map");
//        }
//
//        System.out.println(map.get("China"));//Key exists
//        System.out.println(map.get("Indonesia"));//Key does not exist
//
//        int[] arr = {12,15,18};
//        for(int i=0;i<3;i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//
//        for(int val:arr) {
//            System.out.println(val + " ");
//        }
//        System.out.println();
//
//        for(Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            System.out.println(keys + " " + map.get(key));
//        }
//
//        map.remove("China");
//        System.out.println(map);

        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        mp.put("Kunal", 89);
        mp.put("Karan", 99);
        mp.put("Rahul", 94);

        System.out.println(mp.get("Karan"));
        System.out.println(mp.get("Kunal"));
//        System.out.println(mp.getOrDefault("Apporv", 78));

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(56);
        set1.add(9);
        set1.add(12);
        set1.add(43);
        set1.add(56);
        set1.add(2);
        System.out.println(set1);
    }
}

