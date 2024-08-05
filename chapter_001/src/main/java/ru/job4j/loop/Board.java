package ru.job4j.loop;

import java.math.BigDecimal;

public class Board {
    public String paint(int width, int weight) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal(8587.6);
        System.out.println(b.multiply(BigDecimal.valueOf(6)));

    }
}

