package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {

    public static void even() {
        var name = Cli.greetings();
        final int roundQuantity = 3;
        var round = 0;
        Random random = new Random();
        final int randomNumberLimit = 100;
        while (round < roundQuantity) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int number = random.nextInt(randomNumberLimit);
            String answer = isEven(number) ? "yes" : "no";
            String question = "Question: " + number;
            Engine.engine(question, answer, name, round, roundQuantity);
            round++;
        }
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

