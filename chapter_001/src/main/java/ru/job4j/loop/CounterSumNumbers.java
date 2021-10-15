package ru.job4j.loop;

public class CounterSumNumbers {
    public class Counter {
        public static int sum(int start, int finish) {
            int sum = 0;
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
            }
            return sum;
        }
    }
}
