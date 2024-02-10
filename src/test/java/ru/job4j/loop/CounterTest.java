package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2ToFiveThenThirty() {
        int start = -2;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}