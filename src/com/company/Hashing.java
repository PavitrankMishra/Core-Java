package com.company;

import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Create a hash table
        Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
//        hm.put(3,"You are visiting");
//        hm.put(5,"Hello");
//        hm.put(1,"Website");
//        hm.put(2,"Javatpoint");
//        System.out.println(hm);

//        Creates an empty hashmap
//        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
////        System.out.println(hm1);
//        int[] arr = {1,6,5,10,6,6,10};
//
//        for(int i=0;i<arr.length;i++) {
//            Integer n = hm1.get(arr[i]);
//
//            if(hm1.get(arr[i]) == null) {
//                hm1.put(arr[i], 1);
//            } else {
//                hm1.put(arr[i], ++n);
//            }
//        }
//
//        System.out.println(hm1);

//        Hashmap striver
//        Taking input for array
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

//        Precompute
        int[] hash = new int[13];
        for(int i=0;i<n;i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while(q-- > 0) {
            int number;
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
        }
    }
//        int n = 5;
//        int[] arr = new int[n];
////        Take the input of array
//        for(int i=0;i<n;i++) {
//            System.out.println("Enter the element: ");
//            arr[i] = sc.nextInt();
//        }
//
//        int[] hash = new int[13];
//        for(int i=0;i<n;i++) {
//            hash[arr[i]] += 1;
//        }
//
//        int q;
//        q = sc.nextInt();
//        while(q-- > 0) {
//            int number;
//            number = sc.nextInt();
//            System.out.println(hash[number]);
//}