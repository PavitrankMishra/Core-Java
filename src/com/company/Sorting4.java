//Merge Sort

package com.company;
import java.util.*;

public class Sorting4 {
    public static int[]mergeTwoSortedArrays(int[] a,int[] b) {
        System.out.println("Merging two sorted arrays.");
        int i=0;
        int j = 0;
        int k = 0;
        int[] sum = new int[a.length + b.length];
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                sum[k] = a[i];
                i++;
                k++;
            } else {
                sum[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length) {
            sum[k] = a[i];
            i++;
            k++;
        }

        while(j<b.length) {
            sum[k] = b[j];
            j++;
            k++;
        }

        return sum;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if(lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo+hi)/2;
        int[] fsh = mergeSort(arr, lo, mid);
        int[] ssh = mergeSort(arr, mid+1, hi);
        int[] fsa = mergeTwoSortedArrays(fsh, ssh);

        return fsa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[10];
        System.out.println("Enter the elements ");
        for(int i=0;i<num1.length;i++) {
            num1[i] = sc.nextInt();
        }

        int[] res = mergeSort(num1,0,9 );
        for(int a=0;a<res.length;a++) {
            System.out.println(res[a]);
        }

    }
}
