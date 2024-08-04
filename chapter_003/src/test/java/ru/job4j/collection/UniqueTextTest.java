package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueTextTest {
    @Test
    public void isEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "My eats cat a mouse";
        assertTrue(uniqueText.isEquels(origin, text));
    }

    @Test
    public void isNotEquals() {
        UniqueText uniqueText = new UniqueText();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertFalse(uniqueText.isEquels(origin, text));
    }
}