package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ARRAY_SIZE = 100;
    public static final int MAX_OPERATION = 3;
    public static void calc() {
        var name = Cli.greetings();
        String[] questions = new String[ARRAY_SIZE];
        String[] answers = new String[ARRAY_SIZE];
        for (int i = 0; i < questions.length; i++) {
            var firstNumber = Generator.getRandomInt(MIN, MAX);
            var secondNumber = Generator.getRandomInt(MIN, MAX);
            var operation = generateOperation();
            answers[i] = calculate(firstNumber, secondNumber, operation);
            questions[i] = firstNumber + " " + operation + " " + secondNumber;
        }
        Engine.engine(TASK, name, questions, answers);
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
