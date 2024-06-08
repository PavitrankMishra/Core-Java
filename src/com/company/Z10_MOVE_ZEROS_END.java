package com.company;

public class Z10_MOVE_ZEROS_END {
    public static void main(String[] args) {
        int[] arr = new int[] {0,2,0,0,5,6};
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while(count < arr.length) {
            arr[count++] = 0;
        }

        for(int e:arr) {
            System.out.println(e + " ");
        }
//        int[] arr=  new int[] {0,2,0,0,5,6};
//        int count = 0;
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i] != 0) {
//                arr[count++] = arr[i];
//            }
//        }
//
//        while(count<arr.length) {
//            arr[count++] = 0;
//        }
//
//        for(int e:arr) {
//            System.out.print(e + " ");
//        }
    }
}
