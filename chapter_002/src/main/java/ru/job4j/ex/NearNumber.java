package ru.job4j.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NearNumber {
    public static int closeNumber(List<Integer> numbers, int n) {
        Collections.sort(numbers);
        int result = numbers.get(0);
        int resultTwo = numbers.get(numbers.size() - 1);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < n) {
               result = numbers.get(i);
            } else {
                resultTwo = numbers.get(i);
                break;
            }
        }
        if (n - result <= resultTwo - n) {
            return result;
        } else {
            return resultTwo;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(5);
        System.out.println(closeNumber(list, 10));
    }
}
