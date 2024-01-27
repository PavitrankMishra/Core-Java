package com.company;

import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a == b);//It can give true if a and b both are pointing to same object and false if both a and b are pointing to different object
        if(fruit.equals("mango")) {
            System.out.println("King of fruits");
        }
        if(fruit.equals("apple")) {
            System.out.println("A sweet red fruit");
        }

//        switch(fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("A sweeet red fruit");
//            case "grapes" -> System.out.println("A green fruit");
//            case "berry" -> System.out.println("A berry");
//            "default" -> System.out.println("A new fruit");
////        }
    }
}
