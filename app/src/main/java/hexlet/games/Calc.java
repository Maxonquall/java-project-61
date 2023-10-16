package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculate(String name) {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int numberOneRandomLimit = 100;
        final int numberTwoRandomLimit = 100;
        final int operationTypes = 3;
        var numberOne = random.nextInt(numberOneRandomLimit);
        var numberTwo = random.nextInt(numberTwoRandomLimit);
        var operation = random.nextInt(operationTypes);
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
            default:
                break;
        }
        System.out.println("Question: " + numberOne + " " + symbol + " " + numberTwo);
        System.out.print("Your answer: ");
        var answer = scanner.nextLine();
        if (answer.equals(resultToString)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + result + "'");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }

    }
}
