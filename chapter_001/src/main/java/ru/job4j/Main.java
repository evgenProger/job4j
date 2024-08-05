package ru.job4j;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> newSet = new HashSet<>(set1);
        for (T t : set2) {
            if (!newSet.add(t)) {
                newSet.remove(t);
            }
        }
        return newSet;
    }

    public static void main(String[] args) {


    }
}
