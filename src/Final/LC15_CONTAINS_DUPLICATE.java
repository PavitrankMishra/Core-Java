package Final;

import java.util.HashSet;

public class LC15_CONTAINS_DUPLICATE {
    static boolean check_duplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int ele:nums) {
            if(!set.add(ele)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2,2,3,3,3,5,5};
        boolean ans = check_duplicate(nums);
        System.out.println(ans);

    }
}
