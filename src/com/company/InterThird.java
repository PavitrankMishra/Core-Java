package com.company;

import java.util.*;

//Check if a number is armstrong number of not
public class InterThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int t = sc.nextInt();
        String a = Integer.toString(t);

        int result = 0;
        while(t>0) {
            int digit = t%10;
            result += Math.pow(digit, a.length());
            System.out.println(result);

            t/=10;
       }
        System.out.println(result);
    }
}
