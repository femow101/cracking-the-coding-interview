package com.femow.application.arraysandstrings;

import java.util.List;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromePermutationTest {

    @Test
    public void mustReturnFalse() {
        List<String> inputs = List.of(
            "ab",
            "abc",
            "ababab",
            "abbb");

        inputs.forEach(str -> {
            assertThat(PalindromePermutation.isPermutationOfPalindrome(str)).isFalse();
        });
    }

    @Test
    public void mustReturnTrue() {
        List<String> inputs = List.of(
            "a",
            "aa",
            "aba",
            "aaa",
            "abba");

        inputs.forEach(str -> {
            assertThat(PalindromePermutation.isPermutationOfPalindrome(str)).isTrue();
        });
    }
}