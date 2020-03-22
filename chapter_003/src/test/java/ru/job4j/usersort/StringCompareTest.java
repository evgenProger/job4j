package ru.job4j.usersort;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;


public class StringCompareTest {
    @Test
    public void whenStringAreaEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov");
        assertThat(rst, is(0));

    }
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova");
        assertThat(rst, lessThan(0));
    }
    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova");
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov");
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightSgouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrov",
                "Petrov");
        assertThat(rst, lessThan(0));
    }

    @Test
    public void firstCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "aa",
                "z");
        assertThat(rst, is("aa".compareTo("z")));


    }

    @Test
    public void firstCharLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "a",
                "zz");
        assertThat(rst, is("a".compareTo("zz")));
    }



}