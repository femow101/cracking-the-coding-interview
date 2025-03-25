package com.femow.application.arraysandstrings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCompressionTest {

    @Test
    public void shouldReturnTrue() {
        String[] inputs = {
            "aabcccccaaa", // becomes a2b1c5a3 (len = 8)
            "aaa", // becomes a3 (len = 2)
            "aaaaaaaaaabcdefg", // (len = 16) becomes a10b1c1d1e1f1g1 (len = 15)
        };

        for (String input : inputs) {
            assertThat(StringCompression.checkCompressedIsSmaller(input)).isTrue();
        }
    }

    @Test
    public void shouldReturnFalse() {
        String[] inputs = {
            "a", // becomes a1 (len = 2)
            "aa", // becomes a2 (len = 2)
            "aaaaaaaaaabcdefgh", // (len = 17) becomes a10b1c1d1e1f1g1h1 (len = 17)
            "abb", // becomes a1b2 (len = 4)
        };

        for (String input : inputs) {
            assertThat(StringCompression.checkCompressedIsSmaller(input)).isFalse();
        }
    }
}
