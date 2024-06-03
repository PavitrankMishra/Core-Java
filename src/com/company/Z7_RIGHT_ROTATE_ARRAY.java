package com.company;

public class Z7_RIGHT_ROTATE_ARRAY {
    public static void main(String[] args) {
        int[] arr= new int[] {1,2,3,4,5,6};
        int k = 3;
        for(int i=0;i<k;i++) {
            int last = arr[arr.length - 1],j;
            for(j=arr.length-1;j>0;j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = last;
        }

        for(int e:arr) {
            System.out.println(e);
        }
    }
}
