package com.company;

import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,5,8,78,5);
        multiple(2,3,"Kunal", "Rahul","Rachit");

    }

    static void multiple(int a ,int b, String ...v) {//Variable length should always come at the end
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {//We don't know how many arguments we can pass
        System.out.println(Arrays.toString(v));
    }
}
