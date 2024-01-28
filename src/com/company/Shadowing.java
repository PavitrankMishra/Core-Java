package com.company;

public class Shadowing {
    static int x = 90;//x is going to be available to every function below it
//    It will be shadowed at line 10

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//Scope will begin when value is initialised
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }

}
