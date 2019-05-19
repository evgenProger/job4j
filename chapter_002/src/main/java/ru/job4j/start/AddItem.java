package ru.job4j.start;

import ru.job4j.models.Item;
import ru.job4j.start.StartUI;

public class AddItem implements UserAction {
    @Override
    public int key() {
        return 0;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("-----Добавление новой заявки-----");
        String name = input.ask("Введите имя заявки");
        String description = input.ask("Введите описание заявки");
        Item item = new Item(name, description);
        tracker.add(item);
        System.out.println("------Новая заявка с id:" + item.getId());
        System.out.println("------Новая заявка с именем:" + item.getName());
        System.out.println("------Новая заявка с описанием:" + item.getDescription());


    }

    @Override
    public String info() {
        return "Добавить новую заявку";
    }
}
