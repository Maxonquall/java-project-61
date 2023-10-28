package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GSD {
    public static void gsd() {
        var name = Cli.greetings();
        final int roundQuantity = 3;
        var round = 0;
        while (round < roundQuantity) {
            System.out.println("Find the greatest common divisor of given numbers.");
            var numberOne = generateNumber();
            var numberTwo = generateNumber();
            var answer = calculateGSD(numberOne, numberTwo);
            var question = "Question: " + numberOne + " " + numberTwo;
            Engine.engine(question, answer, name, round, roundQuantity);
            round++;
        }
    }
    private static int generateNumber() {
        Random random = new Random();
        final int numberRandomLimit = 100;
        return random.nextInt(numberRandomLimit);
    }

    private static String calculateGSD(int numberOne, int numberTwo) {
        var gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        return Integer.toString(gcd);
    }
}

