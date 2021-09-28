package ru.job4j.weight;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class WeightTest {
    @Test
    public void whenMan180Then92() {
        Weight fit = new Weight();
        short in = 180;
        double expected = 92;
        double out = fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        Weight fit = new Weight();
        short in = 170;
        double expected = 69;
        double out = fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}

