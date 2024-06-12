package Final;

public class LC7_TWO_SUM {
    public static void main(String[] args) {
        int[] arr = new int[] {2,7,8,13};
        int target = 9;
        int[] res = new int[2];

        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for(int j=i+1;j<arr.length;j++) {
                sum = arr[i] + arr[j];
                if(sum == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        for(int e:res) {
            System.out.print(e + " ");
        }
    }
}
