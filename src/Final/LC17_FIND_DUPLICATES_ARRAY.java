package Final;

public class LC17_FIND_DUPLICATES_ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,1,1,2,3,4,5};
        int duplicate = 0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]) {
                duplicate = arr[i];
                break;
            }
        }
        System.out.println("The duplicate value is: " + duplicate);
    }
}
