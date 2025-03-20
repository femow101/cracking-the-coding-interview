package com.femow.application.arraysandstrings;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckPermutationTest {

    @Test
    public void shouldReturnTrue_whenIsPermutation() {
        assertThat(CheckPermutation.checkPermutation("abc", "cba")).isTrue();
    }

    @Test
    public void shouldReturnFalse_whenIsNotPermutation() {
        List.of("", "b", "aa")
            .forEach(s2 ->
                assertThat(CheckPermutation.checkPermutation("a", s2)).isFalse());
    }
}
