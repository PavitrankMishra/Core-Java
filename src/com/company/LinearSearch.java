package com.company;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
//        Linear Search: Iterate through the array from starting and checks whether the given value is present in the array.
//        Time Complexity:
//        Best Case:O(1)//Constant//Only 1 comparison is made
//        Worst Case:O(n)
        int[] nums = {1,5,7,5,8,9,10};
        int ans = search(nums, 10);
        System.out.println(ans);
//        System.out.println(search(nums, 10));
        int ele = searchtarget(nums, 8);
        System.out.println(ele);
    }

//    search the target and return the element
static int searchtarget(int[] arr,int target) {
    if(arr.length == 0) {
        return -1;
    }

//        Run a for loop
    for (int index = 0;index<arr.length;index++) {
        int element = arr[index];
        if(element == target) {
            return element;
        }
    }

//        This line will execute if none of the return statement above are executed
    return -1;
}

//    Search in the array:Return the index if item found
//    If item not found return -1
    static int search(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }

//        Run a for loop
        for (int index = 0;index<arr.length;index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }

//        This line will execute if none of the return statement above are executed
        return -1;
    }
}
