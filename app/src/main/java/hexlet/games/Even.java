package hexlet.games;

import java.util.Random;


public class Even {

    public static String isEven() {
        Random random = new Random();
        final int randomNumberLimit = 100;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number = random.nextInt(randomNumberLimit);
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        System.out.println("Question: " + number);
        return correctAnswer;
    }

}

