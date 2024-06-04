package com.company;

public class Z12_TWO_SUM {
    public static void main(String[] args) {
        int sum = 0;
        int target = 9;
        int[] arr = new int[] {2,7,5,11};
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                sum = arr[i] + arr[j];
                if(sum == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        for(int e:res) {
            System.out.print(e + " ");
        }
    }
}
