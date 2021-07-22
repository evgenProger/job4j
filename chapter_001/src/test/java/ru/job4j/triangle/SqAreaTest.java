package ru.job4j.triangle;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest  {
    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3Square1Dot171875() {
        double expected = 1.171875D;
        int p = 5;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Square1Dot44() {
        double expected = 1.44D;
        int p = 6;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}