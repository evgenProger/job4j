package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactTest {
    @Test
    public void whenException() {
        Fact fact = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,

                () -> {
                    fact.calc(-5);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less then 0");
    }
}