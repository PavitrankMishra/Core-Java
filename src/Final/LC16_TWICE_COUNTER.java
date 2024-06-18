package Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LC16_TWICE_COUNTER {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("Geeks", "For", "Geeks"));
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String ele : al) {
            map.put(ele, map.get(ele) + 1);
        }

        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
