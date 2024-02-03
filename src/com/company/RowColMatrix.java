package com.company;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        RowColMatrix instance = new RowColMatrix();
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 37;  // specify the target value you want to search
        int[] result = instance.search(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element " + target + " not found in the matrix.");
        } else {
            System.out.println("Element " + target + " found at position: (" + result[0] + ", " + result[1] + ")");
        }
    }

    public int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}
