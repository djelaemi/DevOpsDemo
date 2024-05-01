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

    @Test
    void testNormalNumbers() {
        assertEquals("1", FizzBuzz.calculate(1));
        assertEquals("2", FizzBuzz.calculate(2));
        assertEquals("4", FizzBuzz.calculate(4));
        assertEquals("7", FizzBuzz.calculate(7));
        //einzelne Zahlen für normale Zahlen testen, die weder ein Vielfaches von 3 noch von 5 sind.
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", FizzBuzz.calculate(3));
        assertEquals("Fizz", FizzBuzz.calculate(6));
        assertEquals("Fizz", FizzBuzz.calculate(9));
        assertEquals("Fizz", FizzBuzz.calculate(12));
        //Zahlen testen, die nur ein Vielfaches von 3 sind (sollten "Fizz" zurückgeben).
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", FizzBuzz.calculate(5));
        assertEquals("Buzz", FizzBuzz.calculate(10));
        assertEquals("Buzz", FizzBuzz.calculate(20));
        assertEquals("Buzz", FizzBuzz.calculate(25));
        //Zahlen testen, die nur ein Vielfaches von 5 sind (sollten "Buzz" zurückgeben).
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.calculate(15));
        assertEquals("FizzBuzz", FizzBuzz.calculate(30));
        assertEquals("FizzBuzz", FizzBuzz.calculate(45));
        //Zahlen testen, die sowohl ein Vielfaches von 3 als auch von 5 sind (sollten "FizzBuzz" zurückgeben).
    }

    @Test
    void testEdgeCases() {
        assertEquals("FizzBuzz", FizzBuzz.calculate(0)); // Angenommen, 0 gibt "FizzBuzz" zurück
        assertEquals("Fizz", FizzBuzz.calculate(-3));   // Negative Zahlen könnten auch berücksichtigt werden
        assertEquals("Buzz", FizzBuzz.calculate(-5));   // Negative Zahlen könnten auch berücksichtigt werden
    }

    @Test
    void testLargeNumber() {
    // Testet das Verhalten bei einer sehr großen Zahl
    assertEquals("Fizz", FizzBuzz.calculate(999));
}

    @Test
    void testPrimeNumber() {
    // Testet eine Primzahl, die weder ein Vielfaches von 3 noch von 5 ist
    assertEquals("19", FizzBuzz.calculate(19));
}

    @Test
    void testMaxInt() {
    // Testet das Verhalten bei Integer.MAX_VALUE, das weder ein Vielfaches von 3 noch von 5 ist
    assertEquals(Integer.toString(Integer.MAX_VALUE), FizzBuzz.calculate(Integer.MAX_VALUE));
}

    @Test
    void testNegativeMultipleOfBoth() {
        // Testet negative Zahlen, die ein Vielfaches von sowohl 3 als auch 5 sind
        assertEquals("FizzBuzz", FizzBuzz.calculate(-15));
    }

    @Test
    void testStringRepresentationLength() {
        // Testet, ob die Länge der zurückgegebenen String-Repräsentation der Zahl entspricht
        // Dies kann dazu beitragen, unerwartete Rückgabewerte zu erkennen
        int number = 52;
        String result = FizzBuzz.calculate(number);
        assertEquals(Integer.toString(number).length(), result.length());
    }


}
