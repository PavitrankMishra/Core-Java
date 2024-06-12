package Final;

public class LC8_MAJORITY_ELEMENT {
    public static void main(String[] args) {
        int[] arr = new int[] {2,2,1,1,1,1,2};
        int count = 0;
        int actualCount = 0;
        int initial = 0;
        for(int i=0;i<arr.length;i++) {
            if(count == 0) {
                count++;
                initial = arr[i];
            } else {
                count += (initial == arr[i]) ? +1:-1;
            }
        }

        for(int e:arr) {
            if(e == initial) {
                actualCount++;
            }
        }

        System.out.println(initial);
        System.out.println(actualCount);
    }
}
