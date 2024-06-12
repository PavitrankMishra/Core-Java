package Final;

public class LC2_REMOVE_DUPLICATES_ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,1,1,1,2,2,2,2,4,4};
          int k = 1;
          for(int i=1;i<arr.length;i++) {
              if(arr[i] != arr[i-1]) {
                  arr[k] = arr[i];
                  k++;
              }
          }

        for(int j=0;j<k;j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
