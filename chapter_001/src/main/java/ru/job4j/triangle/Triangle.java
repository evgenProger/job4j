package ru.job4j.triangle;

import ru.job4j.condition.Point;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    /*
     * @param a расстояние между точками a b
     * @param b расстоягние между точками a c
     * @param c расстояние между точками b c
     * @return периметр
     */

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }
    /**
     * Метод должен вычислить площадь треугольника
     * <p>
     * Формула
     * <p>
     * V p*(p-ab)*(p-ac)*(p-bc)
     * где V - корень квадратный, для извлечения корня используется метод Math.sqrt()
     * <p>
     * return вернуть площадь треугольника, если он существует или -1
     */
    public double area() {
        double rs = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = this.period(ab, ac, bc);
            rs = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rs;
    }

    /**
     * Метод проверяет существование треугольника
     * @param ab Расстояние от точки а до точки b
     * @param ac Расстояние от точки до точки c
     * @param bc Расстояние от точки b до точки c
     * @return true если треугольник существует
     */

    private boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && bc + ac > ab && ac + ab > bc;
    }
}


