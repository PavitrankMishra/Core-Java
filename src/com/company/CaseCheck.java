package com.company;

import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(in.next());//Prints only the string that is previous to space
        System.out.println("Enter a string");
        System.out.println(in.next().trim());//It trims the white-space

        System.out.println("Enter a string");
        char ch = in.next().trim().charAt(0);//First trims the input and than return character at particular index
        System.out.println(ch);

        if(ch>='a' && ch<='z' ) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
