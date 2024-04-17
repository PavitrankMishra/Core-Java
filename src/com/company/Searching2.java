//Binary Search - O(logn)

package com.company;
import java.util.*;

public class Searching2 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int data = 30;
        int l = 0;
        int r = a.length-1;
        while(l<=r) {
            int m = (l+r)/2;
            if(data > a[m]) {
                l = m+1;
            } else if(data < a[m]) {
                r = m-1;
            } else {
                System.out.println("Element found at index: " + m);
                return ;
            }
        }
        System.out.println(-1);
    }
}
