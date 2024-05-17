//Fibonacci Number

package com.company;

public class Z5_FIBONACCI_NUMBER {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        int sum = n1+n2;
        System.out.print(n1 + " " + n2 + " " + sum + " ");
        for(int i=2;i<n;i++) {
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
            System.out.print(sum + " ");
        }
    }
}
