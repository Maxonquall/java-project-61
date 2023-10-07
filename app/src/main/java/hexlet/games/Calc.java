package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculate(String name) {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        var numberOne = random.nextInt(10) + 1;
        var numberTwo = random.nextInt(10) + 1;
        var operation = random.nextInt(3);
        var symbol = "";
        var result = 0;
        var resultToString = "";
            switch (operation) {
                case 0:
                    symbol = "+";
                    result = numberOne + numberTwo;
                    resultToString = Integer.toString(result);
                    break;
                case 1:
                    symbol = "-";
                    result = numberOne - numberTwo;
                    resultToString = Integer.toString(result);
                    break;
                case 2:
                    symbol = "*";
                    result = numberOne * numberTwo;
                    resultToString = Integer.toString(result);
                    break;
            }
            System.out.println("Question: " + numberOne + " " + symbol + " " + numberTwo);
            System.out.print("Your answer: ");
            var answer = scanner.nextLine();
            if (answer.equals(resultToString)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + result + "'" );
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }

    }
}
