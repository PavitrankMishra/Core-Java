package com.company;

public class Arr1 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        int[] two = arr;
        two[2] = 200;

        swap(arr,0,4);
        for(int i=0;i<arr.length;i++) {
            System.out.println(two[i]);
        }
    }
}
