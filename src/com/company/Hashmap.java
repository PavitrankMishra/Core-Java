package com.company;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

//        precompute
        HashMap<Integer, Integer> mpp = new HashMap();
        for(int i=0;i<n;i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        int q;
        q = sc.nextInt();
        while(q-- >0) {
            int number;
            number = sc.nextInt();
//            fetch
            System.out.println(mpp.getOrDefault(number,0));
        }
    }
}
