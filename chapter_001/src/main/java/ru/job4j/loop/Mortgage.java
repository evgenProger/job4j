package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        amount  += amount * percent;
        while (amount > 0) {
            year++;
            amount  -= salary;
            if (amount < 0) {
                break;
            }
            amount = amount * percent + amount;

       }
        return year;
    }
}
