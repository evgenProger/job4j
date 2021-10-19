package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Evgeny";
        names[2] = "Masha";
        names[3] = "Dasha";
        System.out.println("ages size = " + ages.length);
        System.out.println("surnames size = " + surnames.length);
        System.out.println("prices size = " + prices.length);
        for (int i = 0; i < 4; i++) {
            System.out.println("name " + names[i]);
        }
    }
}
