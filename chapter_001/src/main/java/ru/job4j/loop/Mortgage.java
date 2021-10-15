package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        double credit =  amount + amount * percent;
        while (credit > 0) {
            year++;
            credit = credit - salary;
            if (credit < 0) {
                break;
            }
            credit = credit * percent + credit;
           ;
       }

        return year;
    }
}
