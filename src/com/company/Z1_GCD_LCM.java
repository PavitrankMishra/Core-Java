//Find GCD AND LCM OF TWO NUMBERS

package com.company;

public class Z1_GCD_LCM {
    public static void main(String[] args) {
        int n1 = 24;
        int n2 = 12;

        int on1 = n1;
        int on2 = n2;

        while(n1%n2 != 0) {
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }

        int gcd = n2;
        System.out.println("The GCD of " + on1 + " " + on2 + " is : " + gcd);

        int lcm = (on1*on2)/gcd;
        System.out.println("The LCM of " + on1 + " " + on2 + " is : " + lcm);
    }
}
