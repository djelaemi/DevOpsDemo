package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testCalculate() {

        assertEquals("1", FizzBuzz.calculate(1));
        assertEquals("Fizz", FizzBuzz.calculate(3));
        assertEquals("Buzz", FizzBuzz.calculate(5));
        assertEquals("FizzBuzz", FizzBuzz.calculate(15));

    }
}
