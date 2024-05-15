package ch.zhaw.iwi.devops.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0) {  // Ändere 7 zu 5 für die übliche FizzBuzz-Regel
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {  // Ändere 7 zu 5 für die übliche FizzBuzz-Regel
            return "Buzz";
        }
        return String.valueOf(i);
    }

}
