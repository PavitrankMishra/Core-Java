package com.company;

import java.util.Arrays;

public class Z11_MISSING_NUMBER_IN_THE_ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,4,6,7,9,1};
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == count) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);

    }
}
