package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;


public class Progression {
    public static void whatNumberIsMissing() {
        var name = Cli.greetings();
        final int roundQuantity = 3;
        var round = 0;
        while (round < roundQuantity) {
            System.out.println("What number is missing in the progression?");
            Random random = new Random();
            var aps = generateArray();
            var missedNumber = random.nextInt(aps.length);
            var answer = aps[missedNumber];
            aps[missedNumber] = "..";
            var question = "Question: " + String.join(" ", aps);
            Engine.engine(question, answer, name, round, roundQuantity);
            round++;
        }
    }

    private static String[] generateArray() {
        Random random = new Random();
        final int lowerBorderOfSize = 5;
        final int upperBorderOfSize = 16;
        var arraySize = random.nextInt(upperBorderOfSize - lowerBorderOfSize) + lowerBorderOfSize;
        int[] numbers = new int[arraySize];
        numbers[0] = generateFirstNumber();
        var step = generateStep();
        String[] numbersToString = new String[arraySize];
        numbersToString[0] = Integer.toString(numbers[0]);
        for (int i = 1; i < arraySize; i++) {
            numbers[i] = numbers[i - 1] + step;
            numbersToString[i] = Integer.toString(numbers[i]);

        }
        return numbersToString;

    }
    private static int generateFirstNumber() {
        Random random = new Random();
        final int firstNumberLimit = 20;
        return random.nextInt(firstNumberLimit);
    }
    private static int generateStep() {
        Random random = new Random();
        final int lowerBorderOfStep = 2;
        final int upperBorderOfStep = 11;
        return random.nextInt(upperBorderOfStep - lowerBorderOfStep) + lowerBorderOfStep;
    }



}
