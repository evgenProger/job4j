package ru.jobj4.pojo;

public class Library {

    public static void main(String[] args) {
        Book it = new Book("It", 764);
        Book witcher = new Book("The witcher", 3256);
        Book discworld = new Book("Discworld", 9845);
        Book solaris = new Book("Solaris", 412);
        Book clean = new Book("Clean code", 21);
        Book[] books = new Book[] {it, witcher, discworld, solaris, clean};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " " + i);
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " " + i);
        }
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i] + " " + i);
            }
        }
    }
}
