package Final;

public class LC20_SEARCH_ROTATED_SORTED_ARRAY {
    static int searched(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        while(l <= r ) {
            int mid = (l+r)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[l] <= arr[mid]) {
                if(target >= arr[l] && target < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,6,7,0,1,2};
        int target = 0;

        int ans = searched(arr, target);
        System.out.println(ans);
    }
}
