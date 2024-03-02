package com.company;

import java.util.*;
public class Hashing {
    public static void main(String[] args) {
//        Number hashing
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//
////        precompute
//        int[] hash = new int[n];
//        for(int i=0;i<n;i++) {
//            hash[arr[i]] += 1;
//        }
//        int q;
//        q = sc.nextInt();
//        while(q-- > 0) {
//            int number;
//            number = sc.nextInt();
//            System.out.println(hash[number]);
//        }

//        Character hashing

        int x = 'a';//It will store ascii value
        System.out.println(x);

        System.out.println("Enter the string");
        String s;
        s = sc.next();

//        pre compute

        int[] hash = new int[26];
        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }
        System.out.println("Enter the number of character s to be checked");
        int q;
        q = sc.nextInt();
        while(q-- > 0) {
            char c;
            c = sc.next().charAt(0);
//            System.out.println(c);
            System.out.println(hash[c-'a']);
        }

    }
}
