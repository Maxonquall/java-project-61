package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void isEven(String name) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int number = random.nextInt(100) + 1;
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'" );
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);

            }

    }
}
