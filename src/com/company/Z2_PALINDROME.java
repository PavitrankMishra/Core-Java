//Check fro Palindrome

package com.company;

public class Z2_PALINDROME {
    public static void main(String[] args) {
        int x = 121;
        int num = 0;
        while(x > 0) {
            int digit = x%10;
            num = num*10 + digit;

            x = x/10;
        }

        System.out.println(num);
    }
}
