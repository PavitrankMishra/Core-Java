package com.company;

public class Recursion {
    public static void main(String[] args) {
//        Write a function that prints hello world;
        print(1);
    }

    static void print(int n) {
        if(n==5) {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n+1);
    }

//    static void message() {
//        System.out.println("Hello world");
//        message1();
//    }
//    static void message1() {
//        System.out.println("Hello world");
//        message2();
//    }
//    static void message2() {
//        System.out.println("Hello world");
//        message3();
//    }
//    static void message3() {
//        System.out.println("Hello world");
//        message4();
//    }
//    static void message4() {
//        System.out.println("Hello world");
//    }
//    static void print1(int a) {
//        System.out.println(a);
//        print2(2);
//    }
//    static void print2(int a) {
//        System.out.println(a);
//        print3(3);
//    }
//    static void print3(int a) {
//        System.out.println(a);
//        print4(4);
//    }
//    static void print4(int a) {
//        System.out.println(a);
//        print5(5);
//    }
//    static void print5(int a) {
//        System.out.println(a);
//    }
}
