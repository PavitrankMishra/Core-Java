package com.company;

import java.util.*;
public class SwapOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,45,59};
        swap(arr, 1,3);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int[] arr,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    };

}
