package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void isPrime() {
        var name = Cli.greetings();
        final int roundQuantity = 3;
        var round = 0;
        while (round < roundQuantity) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            var number = generateNumber();
            var isNumberPrime = isPrime(number);
            String answer = isNumberPrime ? "yes" : "no";
            var question = "Question: " + number;
            Engine.engine(question, answer, name, round, roundQuantity);
            round++;
        }
    }
    private static boolean isPrime(int number) {
        for (int i = 2; (i * i) <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int generateNumber() {
        Random random = new Random();
        final int lowerBorderOfRandom = 2;
        final int upperBorderOfRandom = 1009;
        return random.nextInt(upperBorderOfRandom - lowerBorderOfRandom) + lowerBorderOfRandom;
    }

}
