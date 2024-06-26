package com.company;

import java.util.*;
public class SearchInStrings {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        System.out.println(stringSearch(name, target));
    }

    static boolean stringSearch(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
