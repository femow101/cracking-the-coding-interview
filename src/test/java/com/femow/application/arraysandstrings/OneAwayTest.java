package com.femow.application.arraysandstrings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OneAwayTest {

    @Test
    public void shouldReturnTrue() {
        String[][] inputs = {
            { "pale", "ple" }, // remove
            { "pales", "pale" }, // remove
            { "pale", "bale" }, // change
            { "pale", "pales" } // add
        };

        for (String[] input : inputs) {
            assertThat(OneAway.checkIsOneAway(input[0], input[1])).isTrue();
        }
    }

    @Test
    public void shouldReturnFalse() {
        String[][] inputs = {
            { "pale", "bake" },
        };

        for (String[] input : inputs) {
            assertThat(OneAway.checkIsOneAway(input[0], input[1])).isFalse();
        }
    }
    
}
