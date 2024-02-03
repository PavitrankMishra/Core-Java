package com.company;

import java.util.*;
public class SortedMatrix {
    public static void main(String[] args) {
        SortedMatrix instance = new SortedMatrix();
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int target = 2;
        int[] result = instance.search(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Element " + target + "  not found in the matrix.");
        } else {
            System.out.println("Element " + target + " found at position: (" + result[0] + ", " + result[1] + ")");
        }

    }
//    SEARCH IN THE ROW PROVIDED BETWEEN THE COLUMNS PROVIDED
    static int[] binarySearch(int[][] matrix, int row, int cstart, int cend, int target) {
        while(cstart <= cend) {
            int mid = cstart * (cend - cstart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1) {
            return binarySearch(matrix, 0,0,cols-1,target);
        }

        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;

        //Run the loop till 2 rows are remaining
        while(rstart < (rend - 1)) {//While this is true it will have more than 2 rows
            int mid  = rstart * (rend - rstart) / 2;
            if (matrix[mid][cmid] == target) {
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        //Now we have 2 rows
        //Check whether the target is in the column of 2 rows
        if(matrix[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if(matrix[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1,cmid};
        }

//        Search in 1 half
        if(target <= matrix[rstart][cmid-1]) {
            return binarySearch(matrix, rstart, 0,cmid-1,target);
        }
//        Search in 2 half
        if(target >= matrix[rstart][cmid+1] && target <= matrix[rstart][cmid + 1]) {
            return binarySearch(matrix, rstart,cmid+1, cols-1,target);
        }
//        Search in 3 half
        if(target <= matrix[rstart + 1][cmid - 1]) {
            return binarySearch(matrix, rstart+1,0, cmid-1,target);
        } else {
            return binarySearch(matrix, rstart,cmid+1, cols-1,target);
        }
//        Search in 4 half


    }
}
