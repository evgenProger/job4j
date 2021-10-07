package ru.job4j.start;

import java.util.List;

public class StubInput implements Input {

    private final String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return this.answers[this.position++];
    }

    @Override
    public int ask(String question, List<Integer> range) {
        int res = Integer.parseInt(this.ask(question));
        return res;
    }



}

