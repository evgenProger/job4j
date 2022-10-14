package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("We're driving");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("We are" + passenger + "passengers");
    }

    @Override
    public double price(double fuel) {
        return fuel * 25;
    }
}
