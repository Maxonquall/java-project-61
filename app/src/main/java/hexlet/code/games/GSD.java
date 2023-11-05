package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GSD {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int ARRAY_SIZE = 100;
    public static void gsd() {
        var name = Cli.greetings();
        String[] questions = new String[ARRAY_SIZE];
        String[] answers = new String[ARRAY_SIZE];
        for (int i = 0; i < questions.length; i++) {
            var numberOne = Generator.getRandomInt(MIN, MAX);
            var numberTwo = Generator.getRandomInt(MIN, MAX);
            answers[i] = calculateGSD(numberOne, numberTwo);
            questions[i] = numberOne + " " + numberTwo;
        }
        Engine.engine(TASK, name, questions, answers);
    }

    private static String calculateGSD(int numberOne, int numberTwo) {
        var gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        return Integer.toString(gcd);
    }
}

