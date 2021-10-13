package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tusday";
            case 3 -> "Wednesday";
            case 4 -> "Thusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Mistake";
        };
    }
}
