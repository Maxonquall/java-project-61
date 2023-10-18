package hexlet.games;

import java.util.Random;

public class GSD {
    public static String isGSD() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        final int numberOneRandomLimit = 1000;
        final int numberTwoRandomLimit = 1000;
        var numberOne = random.nextInt(numberOneRandomLimit);
        var numberTwo = random.nextInt(numberTwoRandomLimit);
        var gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        var resultToString = Integer.toString(gcd);
        System.out.println("Question: " + numberOne + " " + numberTwo);
        return resultToString;
    }
}
