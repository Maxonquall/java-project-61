package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCD {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int ROUNDS_COUNT = 10;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void playGcd() {
        var name = Cli.greetings();
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var numberOne = Generator.getRandomInt(MIN, MAX);
            var numberTwo = Generator.getRandomInt(MIN, MAX);
            rounds[i][QUESTION] = numberOne + " " + numberTwo;
            rounds[i][ANSWER] = calculateGSD(numberOne, numberTwo);
        }
        Engine.play(TASK, name, rounds);
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

