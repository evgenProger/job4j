package ru.jobj4.pojo;

import java.time.LocalDate;
import java.time.Month;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Evgeny");
        student.setLastName("Ivanov");
        student.setGroup("2A");
        student.setDate(LocalDate.of(2021, Month.SEPTEMBER, 01));
        System.out.println(student.getName() + System.lineSeparator() + student.getLastName() + System.lineSeparator()
                            + student.getGroup() + System.lineSeparator() + student.getDate());
    }
}
