//Bubble Sort

package com.company;
import java.util.*;

public class Sorting1 {
//    Used for swapping i and j elements
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int[] arr, int i, int j) {
        if(arr[i]<arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int itr = 1;itr<=arr.length-1;itr++) {
            for(int j=0;j<arr.length-itr;j++) {
                if(isSmaller(arr, j+1, j)){
                    swap(arr, j+1,j);
                }
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
