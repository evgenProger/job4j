package ru.job4j.array;

/**
 * Сортировка выборкой
 */

public class SortSelected {
    public static int[] sort(int[] data) {
        int temp = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
