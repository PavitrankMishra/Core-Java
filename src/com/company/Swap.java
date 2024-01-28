package com.company;

public class Swap {
    public static void main(String[] args) {
        swap(5,10);
        String name = "Kunal Kushwaha";
        changeName(name);//Here the copy of the value of the reference variable is passed.
        System.out.println(name);//The value of name will not be changed because in function name is a parameter
//        System.out.println(naam);It cannot access because of scoping
    }
    static void changeName(String naam) {
        naam = "Rahul Rana";//In this a new object is created and not change the original value.
    }

    static void swap(int a, int b) {
        int temp  = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
