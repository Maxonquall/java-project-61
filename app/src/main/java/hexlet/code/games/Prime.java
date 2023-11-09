package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;



public class Prime {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN = 2;
    public static final int MAX = 1009;
    public static final int ROUNDS_COUNT = 10;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void playIsPrime() {
        var name = Cli.greetings();
        String[][] rounds = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < rounds.length; i++) {
            var number = Generator.getRandomInt(MIN, MAX);
            var isNumberPrime = isPrime(number);
            rounds[i][QUESTION] = Integer.toString(number);
            rounds[i][ANSWER] = isNumberPrime ? "yes" : "no";
        }
        Engine.play(TASK, name, rounds);
    }
    private static boolean isPrime(int number) {
        for (int i = 2; (i * i) <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
