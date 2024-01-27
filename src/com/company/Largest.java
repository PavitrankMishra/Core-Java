package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Find largest of 3 numbers

        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        System.out.println("Enter the third number");
        int c = in.nextInt();

//        Q.) Find largest of 3 numbers
//        int max = a;
//        if(b>max) {
//            max = b;
//        }
//        if(c>max) {
//            max = c;
//        }

        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);

    }
}
