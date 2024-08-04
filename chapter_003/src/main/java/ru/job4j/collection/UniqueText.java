package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueText {
    public boolean isEquels(String originText, String dublicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = dublicateText.split(" ");
        Set<String> check = new HashSet<>();
        for(String word: origin) {
            check.add(word);
        }
        for(String word: text) {
            if (!check.contains(word)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
