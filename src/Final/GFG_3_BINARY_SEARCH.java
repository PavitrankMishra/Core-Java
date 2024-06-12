package Final;

public class GFG_3_BINARY_SEARCH {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int start = 0;
        int end = arr.length-1;
        int target = 2;
        while(start<= end) {
            int mid = (start + end)/2;
            if(arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
