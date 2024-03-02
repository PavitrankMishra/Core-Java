package com.company;

import java.util.*;



public class InterSecond {
    static boolean checkPrime(int N){
        for(int i=2;i<Math.sqrt(N);i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner j = new Scanner(System.in);
        int t = j.nextInt();
        boolean ans = checkPrime(t);

        if(t!=1 && ans == true ) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }
}
