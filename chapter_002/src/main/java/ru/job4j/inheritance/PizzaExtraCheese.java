package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    @Override
    public String name() {
        Pizza pizza = new Pizza();
        return pizza.name() + " " +  "with extra cheese";
    }
}
