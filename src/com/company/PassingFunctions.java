package com.company;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        for(int ele : nums) {
            System.out.println(ele);
        }
        change(nums);
        for(int ele : nums) {
            System.out.println(ele);
        }
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
