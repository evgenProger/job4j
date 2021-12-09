package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
   @Test
    public void whenCompareTwoNumbers() {
       assertThat(Max.max(2, 3), is(3));
   }

    @Test
    public void whenCompareThreeoNumbers() {
        assertThat(Max.max(2, 3, 5), is(5));
    }

    @Test
    public void whenCompareFourNumbers() {
        assertThat(Max.max(2, 25, 5, 12), is(25));
    }




}