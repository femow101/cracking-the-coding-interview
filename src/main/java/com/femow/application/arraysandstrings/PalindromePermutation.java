package com.femow.application.arraysandstrings;

import java.util.HashMap;

public class PalindromePermutation {

    public static boolean isPermutationOfPalindrome(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        boolean hasEven = false;
        for (int count : frequencyMap.values()) {
            if (count % 2 == 1) {
                if (hasEven) {
                    return false;
                }

                hasEven = true;
            }
        }


        return true;
    }
}