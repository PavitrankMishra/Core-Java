package Final;

public class LC4_LEFT_ROTATE_ARRAY {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        int k = 3;
        for(int i=0;i<k;i++) {
            int first = arr[0],j;
            for(j=0;j<arr.length-1;j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }

        for(int e:arr) {
            System.out.print(e + " ");
        }
    }
}
