package com.company;

import java.util.*;
public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -5, -4, 2, 3, 4, 16, 18, 22, 45};
        int target = 22;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //Find the middle element
//            int mid = (start + end)/2;//Might be posibble that (start + end) goes out of the range of int.
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if ((target > arr[mid])) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
