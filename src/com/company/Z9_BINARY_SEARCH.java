package com.company;

public class Z9_BINARY_SEARCH {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;
        int k = 10;
        int mid = -1;
        boolean found = false;
        while(start<=end) {
            mid = (start + end)/2;
            if(arr[mid] == k) {
                System.out.println(mid);
                found = true;
                break;
            } else if(arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(!found) {
            System.out.println(-1);
        }

    }
}
