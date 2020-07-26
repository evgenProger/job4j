package ru.job4j.lambda;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Evgen",
                "Vika Ivanova");
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }
    public static void cutOut(String value) {
        if(value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        }
        else {
            System.out.println(value);
        }
    }
}


