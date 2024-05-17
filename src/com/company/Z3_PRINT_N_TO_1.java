//Print N to 1 without loops

package com.company;

import java.util.*;
public class Z3_PRINT_N_TO_1 {
    static void printNos(int N) {
        if(N>0) {
            System.out.println(N + " ");
            printNos(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int N = sc.nextInt();
        printNos(N);
    }
}
