package Final;

public class LC9_MAXIMUM_SUBARRAY_SUM {
    public static void main(String[] args) {
        int[] arr= new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int max_Sum = arr[0];
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            if(sum > max_Sum) {
                max_Sum = arr[i];
            }
            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max_Sum);
    }
}
