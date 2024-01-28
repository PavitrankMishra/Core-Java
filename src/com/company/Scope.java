package com.company;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 70;//Already initialised outside the block in the same function so it can not be initialised again.
            a = 70;//Reassign the original reference variable to some other value
            int c = 99;
        }
//        System.out.println(c);//c is a block scoped variable so it is used in that block only . Values initialised in block is used in the block

//        Scoping in for loops
        for(int i=0;i<4; i++) {
            System.out.println(i);
            int num = 90;
            int A =  10;
        }
//        System.out.println(num);
//        System.out.println(A);
    }

    static void random() {
        int num = 67;
        System.out.println(num);//num is a function scoped so num can be accessed here only.
    }
}
