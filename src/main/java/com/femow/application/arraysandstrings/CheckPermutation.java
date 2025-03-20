package com.femow.application.arraysandstrings;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

    public static boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> dic = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (!dic.containsKey(c1)) {
                dic.put(c1, 1);
            } else {
                dic.put(c1, dic.get(c1) + 1);
            }

            if (!dic.containsKey(c2)) {
                dic.put(c2, -1);
            } else {
                dic.put(c2, dic.get(c2) - 1);
            }
        }

        for (int count : dic.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
