package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort instance = new BubbleSort();
        int[] num1 = {1,2,3,4,5};
        bubbleSort(num1);
        int[] result = instance.bubbleSort(num1);
        for(int ele:result) {
            System.out.print(ele);
        }

    }
    public static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        //For each item, max will come at the last step
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<=arr.length-1;j++) {
                //Swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return arr;
    }
}
