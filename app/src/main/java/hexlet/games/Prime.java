package hexlet.games;

import java.util.Random;

public class Prime {
    public static String isPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        final int lowerBorderOfRandom = 2;
        final int upperBorderOfRandom = 1009;
        var number = random.nextInt(upperBorderOfRandom - lowerBorderOfRandom) + lowerBorderOfRandom;
        var isNumberPrime = isPrime(number);
        String correctAnswer = isNumberPrime ? "yes" : "no";
        System.out.println("Question: " + number);
        return correctAnswer;
    }
    private static boolean isPrime(int number) {
        for (int i = 2; (i * i) <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
