package com.company;

import java.util.*;
public class Patterns {
    public static void main(String[] args) {
//        How to approach :
//        1.)Run the outer for loop same as the number of rows
//        no.of lines = no.of rows
//        no.of times outer loop will run
//        2.)Identify for every row number how many columns are there or types of element in the column
//        3.)What do you need to print
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);

    }

    static void pattern1(int n) {
        for(int row = 1;row<=n;row++) {
            for(int col=1;col<=n;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int row = 1;row <=n;row++) {
//            for every row run the col
            for(int col = 1; col<=row;col++) {
                System.out.print("* ");
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int row = 1;row<=n;row++) {
            for(int col=n;col>=row;col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int row = 1;row<=n;row++) {
            for(int col=1;col<=row;col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int row = 1;row<=2*n-1;row++) {
            if(row<=5) {
                for(int col=1;col<=row;col++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for(int col = 2*n-1;col>=row;col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattern6(int n) {
        for(int row = 1;row<=n;row++) {
            //Print spaces
            for(int col = 1;col<=n-row;col++) {
                System.out.print(" ");
            }
//            Print asterisks
            for(int k=1;k<=row;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for(int row = 1;row<=n;row++) {
            //Print white spaces
            for(int col = 1;col<=row;col++) {
                System.out.print(" ");
            }

            //Print asterisks
            for(int k = 1;k<=n-row;k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }



}
