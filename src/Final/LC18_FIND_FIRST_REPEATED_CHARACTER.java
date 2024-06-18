package Final;

import java.util.HashSet;

public class LC18_FIND_FIRST_REPEATED_CHARACTER {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<Character>();
        String s = "geeksforgeeks";
        String ans = "";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(set.add(c) == false) {
                ans += c;
                break;
            }
        }
        System.out.println(ans);
    }
}
