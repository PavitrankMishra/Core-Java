//Selection Sort

package com.company;
import java.util.*;

public class Sorting2 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int[] arr, int i, int j) {
        if(arr[j] < arr[i]) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            int mi = i;

            for(int j=i+1;j<arr.length;j++) {
                if(isSmaller(arr, i, j)){
                    mi = j;
                }
            }

            swap(arr, mi, i);
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
