package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ROUNDS_COUNT = 10;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static final int MAX_OPERATION = 3;
    public static void playCalc() {
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var firstNumber = Generator.getRandomInt(MIN, MAX);
            var secondNumber = Generator.getRandomInt(MIN, MAX);
            var operation = generateOperation();
            rounds[i][QUESTION] = firstNumber + " " + operation + " " + secondNumber;
            rounds[i][ANSWER] = calculate(firstNumber, secondNumber, operation);
        }
        Engine.play(TASK, rounds);
    }

    private static String generateOperation() {
        var operation = Generator.getRandomInt(MIN, MAX_OPERATION);
        return switch (operation) {
            case 0:
                yield "+";
            case 1:
                yield "-";
            case 2:
                yield "*";
            default:
                yield null;
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
