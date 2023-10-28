package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Cli;
import hexlet.code.games.Calc;
import hexlet.code.games.GSD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static void engine(String question, String answer, String name, int round, int roundQuantity) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
                if (round == roundQuantity - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);

        }
    }
}


