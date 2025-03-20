package com.femow.application.arraysandstrings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UrlifyTest {

    @Test
    public void shouldReturnUrl() {
        assertThat(Urlify.toURL("")).isEqualTo("");
        assertThat(Urlify.toURL("   ")).isEqualTo("");
        assertThat(Urlify.toURL("   a")).isEqualTo("a");
        assertThat(Urlify.toURL("a   ")).isEqualTo("a");
        assertThat(Urlify.toURL("a   a")).isEqualTo("a%20a");
    }
}
