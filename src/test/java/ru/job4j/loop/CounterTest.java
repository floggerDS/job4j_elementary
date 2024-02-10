package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart1Finish3Then6() {
        int expected = 6;
        int result = Counter.sum(1, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish0Then0() {
        int expected = 0;
        int result = Counter.sum(0, 0);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish1Then0() {
        int expected = 0;
        int result = Counter.sum(5, 1);
        assertThat(result).isEqualTo(expected);
    }
}