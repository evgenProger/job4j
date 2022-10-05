package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Я выиграю завтра в соревнованиях?");
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes");
        } else if (answer == 1) {
            System.out.println("No");
        } else  {
            System.out.println("Maybe");
        }
    }
}
