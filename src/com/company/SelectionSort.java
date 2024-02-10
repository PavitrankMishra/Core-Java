package com.company;

import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort instance = new SelectionSort();
        int[] nums = {5,2,4,8,2};
        selection(nums);
//        String result = Arrays.toString(nums);
        for(int ele:nums) {
            System.out.print(ele);
        }

    }

    static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            //Find the max item in the remaining array and swap it with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
//            System.out.println(maxIndex);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


}
