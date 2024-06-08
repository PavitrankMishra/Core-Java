package com.company;

public class Z13_MAJORITY_ELEMENT {
    public static void main(String[] args) {
        int count = 0;
        int initial = 0;
        int max_Count = 0;
        int[] nums = new int[] {2,2,1,1,1,2,2};
        for(int i=0;i<nums.length;i++){
            if(count == 0) {
                count++;
                initial = nums[i];
            } else if(initial == nums[i]) {
                count++;
            }else {
                count--;
            }
        }
        for(int e:nums) {
            if(e == initial) {
                max_Count++;
            }
        }
        System.out.println(initial);
        System.out.println(max_Count);
    }
}
