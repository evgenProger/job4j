package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.triangle.Triangle;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point point = new Point(0, 0);
        double result = point.distance(new Point(0, 2));
        double expected = 2D;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when12to21then14() {
        Point point = new Point(1, 2);
        double result = point.distance(new Point(2, 1));
        double expected = 1.414D;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when35to149then11705() {
        Point point = new Point(3, 5);
        double result = point.distance(new Point(14, 9));
        double expected = 11.705D;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when819to1344then25495() {
        Point point = new Point(8, 19);
        double result = point.distance(new Point(13, 44));
        double expected = 25.495D;
        Assert.assertEquals(result, expected, 0.1);
    }

}
