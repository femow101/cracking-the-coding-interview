package com.femow.application.arraysandstrings;

/*
 * 1.6
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters(a-z).
 */
public class StringCompression {

    public static boolean checkCompressedIsSmaller(String str) {
        int strLen = str.length();
        int compressedLen = 0;
        char lastChar = str.charAt(0);
        int counterLast = 1;

        for (int i = 1; i < strLen; i++) {
            char currentChar = str.charAt(i);

            if (lastChar == currentChar) {
                counterLast++;
            } else {
                compressedLen += getNumbersDecimals(counterLast) + 1;
                counterLast = 1;
                lastChar = currentChar;
            }
        }

        if (counterLast > 0) {
            compressedLen += getNumbersDecimals(counterLast) + 1;
        }

        return compressedLen < strLen;
    }

    private static int getNumbersDecimals(int count) {
        int decimalsCount = 0;

        while (count > 0) {
            count /= 10;
            decimalsCount++;
        }

        return decimalsCount;
    }
}
