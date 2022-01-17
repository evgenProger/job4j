package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.triangle.Triangle;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void when00to20then2Dot0() {
        Point point = new Point(0, 0);
        double result = point.distance(new Point(0, 2));
        double expected = 2;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when12to21then1Dot414() {
        Point point = new Point(1, 2);
        double result = point.distance(new Point(2, 1));
        double expected = 1.414;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when35to149then11Dot705() {
        Point point = new Point(3, 5);
        double result = point.distance(new Point(14, 9));
        double expected = 11.705;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when819to1344then25Dot495() {
        Point point = new Point(8, 19);
        double result = point.distance(new Point(13, 44));
        double expected = 25.495;
        Assert.assertEquals(result, expected, 0.1);
    }

    @Test
    public void when549to7123then10Dot198() {
        Point point = new Point(5, 4, 9);
        double result = point.distance3d(new Point(7, 12, 3));
        double expected = 10.2;
        Assert.assertEquals(result, expected, 0.1);
    }

}
