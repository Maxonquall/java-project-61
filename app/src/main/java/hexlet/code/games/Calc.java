package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    public static void calc() {
        var name = Cli.greetings();
        final int roundQuantity = 3;
        var round = 0;
        while (round < roundQuantity) {
            System.out.println("What is the result of the expression?");
            var firstNumber = generateNumber();
            var secondNumber = generateNumber();
            var operation = generateOperation();
            var answer = calculate(firstNumber, secondNumber, operation);
            var question = "Question: " + firstNumber + " " + operation + " " + secondNumber;
            Engine.engine(question, answer, name, round, roundQuantity);
            round++;
        }
    }
    private static int generateNumber() {
        Random random = new Random();
        final int numberRandomLimit = 100;
        return random.nextInt(numberRandomLimit);
    }
    private static String generateOperation() {
        Random random = new Random();
        final int operationTypes = 3;
        var operation = random.nextInt(operationTypes);
        return switch (operation) {
            case 0:
                yield "+";
            case 1:
                yield "-";
            case 2:
                yield "*";
            default:
                yield "";
        };
    }
    private static String calculate(int firstNumber, int secondNumber, String operation) {
        var result = switch (operation) {
            case "+":
                yield firstNumber + secondNumber;
            case "-":
                yield firstNumber - secondNumber;
            case "*":
                yield firstNumber * secondNumber;
            default:
                yield 0;
        };
        return Integer.toString(result);
    }
}
