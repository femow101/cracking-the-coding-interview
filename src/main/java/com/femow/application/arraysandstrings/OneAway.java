package com.femow.application.arraysandstrings;

public class OneAway {

    public static boolean checkIsOneAway(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        boolean hasChange = false;
        int p1 = 0, p2 = 0;

        while (p1 < len1 && p2 < len2) {
            char c1 = s1.charAt(p1), c2 = s2.charAt(p2);

            if (c1 != c2) {
                if (hasChange) {
                    return false;
                }

                hasChange = true;
                if (len1 == len2) {
                    p1++;
                    p2++;
                } else if (len1 > len2) {
                    p1++;
                } else {
                    p2++;
                }
            } else {
                p1++;
                p2++;
            }
        }

        return !hasChange || len2 <= len1;
    }
}
