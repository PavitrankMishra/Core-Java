package Final;

public class GFG_1_IMMEDIATE_SMALLER_ELEMENT {
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,5,1,3};
        for(int i=0;i<arr.length-1;i++) {
            int temp = arr[i+1];
            if(arr[i+1] < arr[i]) {
                arr[i] = temp;
            } else {
                arr[i] = -1;
            }
        }
        arr[arr.length-1] = -1;

        for(int e:arr) {
            System.out.print(e + " ");
        }
    }
}
