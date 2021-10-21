package ru.job4j.array;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;


public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9};
        Assert.assertArrayEquals(rst, expect);
    }
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9, 16, 25};
        Assert.assertArrayEquals(rst, expect);
        }
    }


