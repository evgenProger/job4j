package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean validName = true;
        if (name.isEmpty()) {
            return false;
        }
        if (Character.isUpperCase(name.charAt(0))
                || isSpecialSymbol(name.charAt(0))
                || Character.isDigit(name.charAt(0))) {
            return false;

        }
        for (int i = 1; i < name.length(); i++) {

            if (!(isLowerLatinLetter(name.charAt(i))
                    || isUpperLatinLetter(name.charAt(i))
                    || isSpecialSymbol(name.charAt(i))
                    || Character.isDigit(name.charAt(i)))) {

                validName = false;
                break;
            }
        }
        return validName;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == '\u0024' || code == '\u005F';
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

}
