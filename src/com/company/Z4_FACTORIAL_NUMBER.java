//Factorial of a number

package com.company;

public class Z4_FACTORIAL_NUMBER {
    static int printFact(int n) {
        int result = 1;
        for(int i=n;i>0;i--) {
            result = result*i;
        }

        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFact(n));
    }
}
