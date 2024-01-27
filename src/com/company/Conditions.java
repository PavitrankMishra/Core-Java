package com.company;

public class Conditions {
    public static void main(String[] args) {
//        If statement
        int salary = 25400;
//        if(salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//
//        System.out.println(salary);

//        Multiple If else statement
        if(salary > 10000) {
            salary += 2000;
        } else if(salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);

        int a =10;
        int b = 40;

        if(a!=35) {
            System.out.println("Hello world");
        }


    }
}
