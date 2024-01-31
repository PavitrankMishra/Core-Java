package com.company;

import java.util.*;
public class minElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {5,7,8,4,121,6};
        System.out.println(min(arr));

    }

    static int min(int[]arr) {
        int ans = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < ans) {
                ans =  arr[i];
            }
        }
        return ans;
    }
}
