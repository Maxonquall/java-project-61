package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;



public class Prime {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MIN = 2;
    public static final int MAX = 1009;
    public static final int ARRAY_SIZE = 100;

    public static void isPrime() {
        var name = Cli.greetings();
        String[] questions = new String[ARRAY_SIZE];
        String[] answers = new String[ARRAY_SIZE];
        for (int i = 0; i < questions.length; i++) {
            var number = Generator.getRandomInt(MIN, MAX);
            var isNumberPrime = isPrime(number);
            answers[i] = isNumberPrime ? "yes" : "no";
            questions[i] = Integer.toString(number);
        }
        Engine.engine(TASK, name, questions, answers);
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
