package ru.job4j.builder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.*;

import static org.junit.Assert.*;

public class Job4JStreamTest {
    @Test
    public void testMyselfStream() {
        List<String> str = new ArrayList<>();
        str.add("Petr");
        str.add("Vladimir");
        str.add("Ann");
        str.add("Evgeniy");
        Predicate<String> pr  = p -> p.length() < 4;
        List<String> expected = List.of("Ann");
        List<String> result = Job4JStream.of(str).filter(pr).collect(str);
        assertThat(result, is(expected));
     }
}