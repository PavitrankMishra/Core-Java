//Merge two sorted arrays

package com.company;
import java.util.*;

public class Sorting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[5];
        int[] a2 = new int[8];
        int[] a3 = new int[13];
        int i = 0;
        int j = 0;
        int k = 0;

        System.out.println("Taking input for first array");
        for(int a=0;a<a1.length;a++) {
            a1[a] = sc.nextInt();
        }

        System.out.println("Taking input for second array");
        for(int b=0;b<a2.length;b++) {
            a2[b] = sc.nextInt();
        }

        while(i<a1.length && j<a2.length) {
            if(a1[i]<a2[j]) {
                a3[k] = a1[i];
                i++;
                k++;
            } else {
                a3[k] = a2[j];
                j++;
                k++;
            }
        }

        while(i<a1.length) {
            a3[k] = a1[i];
            i++;
            k++;
        }

        while(j<a2.length) {
            a3[k] = a2[j];
            j++;
            k++;
        }


        for(int item:a3) {
            System.out.print(item);
        }
    }
}
