package ru.job4j.triangle;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
     @Test
        public void whenAreaSetThreePointsThenTriangleArea() {
            Triangle triangle = new Triangle();
            double result = triangle.area(0, 0, 0, 2, 2, 0);
            double expected = 2D;
            assertThat(result, closeTo(expected, 0.1));
        }
    }
