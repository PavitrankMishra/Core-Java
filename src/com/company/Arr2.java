//Span of aray

package com.company;
import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
