package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeCalc(String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int lowerBorderOfRandom = 2;
        final int upperBorderOfRandom = 1009;
        var number = random.nextInt(upperBorderOfRandom - lowerBorderOfRandom) + lowerBorderOfRandom;
        var isNumberPrime = isPrime(number);
        String correctAnswer = isNumberPrime ? "yes" : "no";
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        var answer = scanner.nextLine();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("No");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
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

}
