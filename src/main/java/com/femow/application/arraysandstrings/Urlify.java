package com.femow.application.arraysandstrings;

public class Urlify {

    public static String toURL(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isEmptyBefore = false;

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                isEmptyBefore = true;
                continue;
            }

            if (isEmptyBefore && !stringBuilder.isEmpty()) {
                stringBuilder.append("%20");
                isEmptyBefore = false;
            }

            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
