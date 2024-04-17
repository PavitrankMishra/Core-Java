//Linear Search

package com.company;
import java.util.*;

public class Searching1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int num = 20;
        for(int i=0;i<arr.length;i++ ){
            if(arr[i] == num) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }
}
