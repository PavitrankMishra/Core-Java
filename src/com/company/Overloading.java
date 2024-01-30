package com.company;

import java.util.*;
public class Overloading {
    public static void main(String[] args) {
        fun(5);
        fun("Hello");
        System.out.println(sum(5,8));
        demo(2,3,4,5);
//        demo("Kunal", "Rachit");
//        demo();Error because don't know which method to run
    }

//    Function overloading at compile determines which function to run
    static void fun(String a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(int a) {
        System.out.println("Second one");
        System.out.println(a);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void demo(int ...v) {
//        System.out.println(Arrays.toString(v));
    }

//    static void demo(String ...v) {
//        System.out.println(Arrays.toString(v));
//    }
}
