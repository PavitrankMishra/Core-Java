package com.company;

import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//        int num2 = (int)67.56f;

//        Automatic type promotion in expressions
//        int a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b) / c;//The problem is calculated using integers
//
//        System.out.println(d);
//        byte b = 50;
//        b = b*2;//Error because the value of byte has increased to int

        int number = 'A';
        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50100;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) + " " + (i/c)  + " " +(d-s));
        System.out.println(result);
    }
}
