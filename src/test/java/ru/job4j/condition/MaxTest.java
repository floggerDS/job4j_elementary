package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void whenMax3To2Then2() {
        int result = Max.max(3, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void whenMax3To3Then3() {
        int result = Max.max(3, 3);
        assertThat(result).isEqualTo(3);
    }
}