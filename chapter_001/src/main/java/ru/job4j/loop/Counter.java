package ru.job4j.loop;

public class Counter {
    /**
     * Метод вычисляет сумму четных числе
     * @param start начальное значение
     * @param finish конечное значение
     * @return возвращает сумму четных чисел
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= finish; start++) {
            if (start % 2 == 0) {
               sum = sum + start;
            }
        }
     return sum;
    }
}
