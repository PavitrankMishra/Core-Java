package com.company;

import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Array of primitives
//        int[] nums = new int[5];

//        int[] ros;//Declaration of array. ros is getting defined in stack
//        ros = new int[5];//Initialisation: Actually here object is being created in the heap memory
//        System.out.println(ros[0]);

//        String[] arr = new String[4];
//        System.out.println(arr[0]);

//        String str = null;
//        int ntr = null;We can't assign null to int data type because it is a literal

//        int[] arr = new int[5];
//        arr[0]=  542;
//        arr[1]=  543;
//        arr[2]=  544;
//        arr[3]=  545;
//        arr[4]=  546;
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i=0;i<arr.length;i++) {
//            System.out.println(arr[i] + " ");
//        }

//        Enhanced for loop:
//        for(int num : arr) {//For every element in the array print the element
//            System.out.print(num + " ");
//        }

        //Array of objects
         String[] str1 = new String[4];
        for (int i=0;i<str1.length;i++) {
            str1[i] = in.next();
        }
//
//        System.out.println(Arrays.toString(str1));

//        modify
        str1[1] = "Kunal";
        for(String ele : str1) {
            System.out.println(ele);
        }


    }
}
