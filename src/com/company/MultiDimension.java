package com.company;

import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        int[][] arr = new int[3][];//Adding number of columns is not mandatory

        int [][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        System.out.println(arr1[1][0]);

        int [][] arr2D = {//We  don;t need to specify column size because 2D array is an array of objects. So, inside array also the object points to some value
                {1,2,3},
                {4,5},
                {7,8,9}
        };

//        int[][] arr3 = new int[3][2];
//        System.out.println(arr3.length);

//        Output
        for(int row = 0;row < arr1.length;row++) {
            //For each column in every row
            for(int col = 0;col < arr1[row].length;col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        for(int[] el : arr1) {
            System.out.println(el);
        }

    }
}
