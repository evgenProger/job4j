package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int j = 0;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - i - 1] != word[word.length - j - 1]) {
                result = false;
                break;
            }
            j++;
        }


        return result;
    }

}
