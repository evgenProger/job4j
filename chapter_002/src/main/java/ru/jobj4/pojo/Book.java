package ru.jobj4.pojo;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='"
                + name
                + '\''
                + ", pages="
                + pages
                + '}';
    }
}
