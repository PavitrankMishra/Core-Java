package com.company;

import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
//        Operator will work if one of the value is string and a string will be printed as output
//        '+' is the only operator in java that will perform both string concatenation and string joining.So it is known as operator overloading
        System.out.println('a' + 'b');//Operator is converting add the ASCII value
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("A" + 5);//Simple concatenation of string and integer.This will be same as "A" + "1".
//        integer will be converted to Integer that will call toString()
        System.out.println("Kunal" + new ArrayList());
        System.out.println("Kunal" + new Integer(56));
    }
}
