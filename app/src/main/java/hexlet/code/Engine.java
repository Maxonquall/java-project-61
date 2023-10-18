package hexlet.code;

import hexlet.games.Even;
import hexlet.games.Cli;
import hexlet.games.Calc;
import hexlet.games.GSD;
import hexlet.games.Progression;
import hexlet.games.Prime;

import java.util.Scanner;

public class Engine {
    public static void engine(String gameIdentifier) {
        String name = Cli.greetings();
        Scanner scanner = new Scanner(System.in);
        var correctAnswer = "";
        final int countOfGames = 3;
        var count = 0;
        while (count < countOfGames) {
            switch (gameIdentifier) {
                case "2":
                    correctAnswer = Even.isEven();
                    break;
                case "3":
                    correctAnswer = Calc.whatIsResult();
                    break;
                case "4":
                    correctAnswer = GSD.isGSD();
                    break;
                case "5":
                    correctAnswer = Progression.whatNumberIsMissing();
                    break;
                case "6":
                    correctAnswer = Prime.isPrime();
                    break;
                default:
                    break;
            }
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);

            }
        }
        if (count == countOfGames) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}


