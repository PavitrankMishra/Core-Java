package com.company;

import java.util.*;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(searchtargetinRange(arr,target, 1 ,4));

    }

    static int searchtargetinRange(int[] arr,int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

//        Run a for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }

        return -1;
    }
}
