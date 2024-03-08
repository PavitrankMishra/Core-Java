package com.company;

import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {9,14,3,2,43,11,58,22};
        System.out.println("Before sorting");
        for(int el:arr) {
            System.out.print(el + " ");
        }

        for(int i=0;i<arr.length;i++) {
            int index = i;
            for(int j=i+1;j<arr.length-1;j++) {
                if(arr[j]<arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println();

        System.out.println("After sorting");
        for(int el:arr) {
            System.out.print(el + " ");
        }
    }
}
