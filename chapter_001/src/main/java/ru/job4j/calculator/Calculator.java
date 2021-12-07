package ru.job4j.calculator;

public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public double add(double first, double second, double third, double four) {
        return add(first,
                add(second,
                        add(third, four)));
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double div(double first, double second) {
        return first / second;
    }

    public double multiple(double first, double second) {
        return first * second;
    }
}