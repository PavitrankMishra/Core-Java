package com.company;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++) {
            char ch = (char)('a' + i);
            builder.append(ch);//StringBuilder class does not create a new object but add the value in the previous object
        }

        System.out.println(builder.toString());

        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
