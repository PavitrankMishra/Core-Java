//Remove Duplicates From Sorted Array

package com.company;

public class Z6_REMOVE_DUPLICATES_FROM_ARRAY {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        if(arr.length == 0) {
            System.out.println(0);
        }

        int k=1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] != arr[i-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++) {
            System.out.println(arr[i]);
        }
    }
}
