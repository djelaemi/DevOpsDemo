package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {

    @Test
    public void fizzBuzzConverterForNumberOne() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("1", fizzBuzz.convert(1)); // Testet, ob die Zahl 1 korrekt als "1" zurückgegeben wird.
    }

    @Test
    public void fizzBuzzConverterForNumberTwo() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("2", fizzBuzz.convert(2)); // Testet, ob die Zahl 2 korrekt als "2" zurückgegeben wird.
    }

    @Test
    public void fizzBuzzConverterForMultipleOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Fizz", fizzBuzz.convert(3)); // Testet, ob Vielfache von 3 korrekt als "Fizz" zurückgegeben werden.
        Assertions.assertEquals("Fizz", fizzBuzz.convert(6)); // Zusätzlicher Test für ein anderes Vielfaches von 3.
    }

    @Test
    public void fizzBuzzConverterForMultipleOfFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Buzz", fizzBuzz.convert(5)); // Testet, ob Vielfache von 5 korrekt als "Buzz" zurückgegeben werden.
        Assertions.assertEquals("Buzz", fizzBuzz.convert(10)); // Zusätzlicher Test für ein anderes Vielfaches von 5.
        Assertions.assertEquals("Buzz", fizzBuzz.convert(20)); // Weitere Bestätigung für Vielfache von 5.
    }

    @Test
    public void fizzBuzzConverterForMultipleOfThreeAndFive() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(15)); // Testet, ob gemeinsame Vielfache von 3 und 5 als "FizzBuzz" zurückgegeben werden.
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(30)); // Zusätzlicher Test für ein weiteres gemeinsames Vielfaches von 3 und 5.
    }

}
