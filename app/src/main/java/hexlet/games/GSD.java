package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class GSD {
    public static void gcdCalc(String name) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var numberOne = random.nextInt(1000) + 1;
        var numberTwo = random.nextInt(1000) + 1;
        var gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        var resultToString = Integer.toString(gcd);
        System.out.println("Question: " + numberOne + " " + numberTwo);
        System.out.print("Your answer: ");
        var answer = scanner.nextLine();
        if (answer.equals(resultToString)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + gcd + "'" );
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }
}
