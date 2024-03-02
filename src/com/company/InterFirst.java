package com.company;

//Find all Palindrome Numbers in a given range
import java.util.*;
public class InterFirst {
    static String reverse(String s) {
        String num = "";
        for(int i=s.length()-1;i>=0;i--) {
            num += s.charAt(i);
        }
        System.out.println(num);
//        System.out.println(Integer.parseInt(num));
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for palindrome");
        int t = sc.nextInt();
        String s = Integer.toString(t);
        System.out.println(s.length());
        String reversedNum = reverse(s);
        if(s.equals(reversedNum)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
