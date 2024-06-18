package Final;

import java.util.*;
public class LC19_FIRST_UNIQUE_CHARACTERS_IN_STRING {
    public static void main(String[] args) {
        String s = "leetcode";
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            map.put(c, map.get(c) + 1);
        }

        int ans = 0;
        for(int j=0;j<s.length();j++) {
            char d = s.charAt(j);
            if(map.get(d) == 1) {
                ans = j;
                break;
            }
        }

    }
}
