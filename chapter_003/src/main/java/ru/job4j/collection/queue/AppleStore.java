package ru.job4j.collection.queue;

import java.util.Queue;

public class AppleStore {

    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer happyCustomer = null;
        for (int i = 0; i < count; i++) {
            happyCustomer = queue.poll();
        }
        return happyCustomer.name;
    }

    public String getFirstUpsetCustomer() {
        Customer happyCustomer = null;
        for (int i = 0; i < count + 1; i++) {
            happyCustomer = queue.poll();
        }
        return happyCustomer.name;
    }

}
