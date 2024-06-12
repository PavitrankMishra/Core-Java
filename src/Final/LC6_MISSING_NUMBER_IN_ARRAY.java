package Final;

import java.util.*;
public class LC6_MISSING_NUMBER_IN_ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,8,5,9,6,3,1};

        int count = 1;
        int result = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != count) {
                result = count;
                break;
            } else {
                count++;
            }
        }

        System.out.println(count);

        System.out.println(result);
    }
}
