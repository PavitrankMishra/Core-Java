package com.company;

public class Recursion1 {
//    static int[] print(int[] a,int count,  int n) {
//        if(count<n){
//            a[count] = count;
////            count++;
//            System.out.println(a[count]);
//            return print(a, count+1, n);
//        }
//        return a;
//    }

//    static int[] print2(int[] a, int initial, int n) {
//        if(n>0){
//            a[initial] = n;
//            System.out.println(a[initial]);
//            return print2(a, initial+1, n-1);
//        }
//        return a;
//    }

//    static long print3(long result, long count, long n) {
//        if(count <= n) {
//            result += count;
//            return print3(result, count+1, n);
//        }
//        return result;
//    }

    static int[] print4(int n, int []nums, int initial, int[] ar) {
        if(initial<n) {
            ar[initial] = nums[n-1];
            return print4(n,nums,initial+1, ar);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int n = 5;
        int result = 0;
//        int[] arr = {1,2,3,4,5};
        int initial = 0;
//        long[] arr = new int[n];
//        print(arr,0,n);
//        print2(arr, 0,5);
//        long res = print3(result, 1,n);
//        System.out.println(res);
        int[] res1 = print4(n, arr, initial, arr);
        for(int i=0;i<res1.length;i++) {
            System.out.println(res1[i]);
        }

    }
}
