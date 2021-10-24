package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 2};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));

    }
    @Test
    public void whenArrayNoElement() {
        FindLoop notfind = new FindLoop();
        int[] input = new int[] {4, 9, 16};
        int value = 6;
        int expect = -1;
        int result = notfind.indexOf(input, value);
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop findLoop = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = findLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        FindLoop findLoop = new FindLoop();
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind() {
        FindLoop findLoop = new FindLoop();
        int[] data = new int[] {12, 24, 7, 32, 78};
        int el = 6;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }


}