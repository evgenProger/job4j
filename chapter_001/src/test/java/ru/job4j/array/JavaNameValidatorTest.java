package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.JavaNameValidator.isNameValid;

public class JavaNameValidatorTest {

    @Test
    public void whenEmptyNameInvalid() {
        assertThat(isNameValid("")).isFalse();
    }

    @Test
    public void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    public void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(isNameValid("fIRST")).isTrue();
    }

    @Test
    public void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    public void whenLatWithSpecialSymbolUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    public void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    public void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(isNameValid("First")).isFalse();
    }

    @Test
    public void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1")).isTrue();
    }
}