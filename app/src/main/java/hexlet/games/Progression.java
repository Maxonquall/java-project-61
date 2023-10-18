package hexlet.games;

import java.util.Random;


public class Progression {
    public static String whatNumberIsMissing() {
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        final int firstNumberLimit = 20;
        final int lowerBorderOfStep = 2;
        final int upperBorderOfStep = 11;
        var arraySize = generateArraySize();
        int[] numbers = new int[arraySize];
        String[] numbersToString = new String[arraySize];
        numbers[0] = random.nextInt(firstNumberLimit);
        numbersToString[0] = Integer.toString(numbers[0]);
        var step = random.nextInt(upperBorderOfStep - lowerBorderOfStep) + lowerBorderOfStep;
        var missedNumber = random.nextInt(arraySize);
        for (int i = 1; i < arraySize; i++) {
            numbers[i] = numbers[i - 1] + step;
            numbersToString[i] = Integer.toString(numbers[i]);
        }
        var correctAnswer = numbersToString[missedNumber];
        numbersToString[missedNumber] = "..";
        System.out.print("Question: ");
        for (int j = 0; j < numbersToString.length - 1; j++) {
            System.out.print(numbersToString[j] + " ");
        }
        System.out.println(numbersToString[numbersToString.length - 1]);
        return correctAnswer;
    }

    private static int generateArraySize() {
        Random random = new Random();
        final int lowerBorderOfSize = 5;
        final int upperBorderOfSize = 16;
        return random.nextInt(upperBorderOfSize - lowerBorderOfSize) + lowerBorderOfSize;
    }
}
