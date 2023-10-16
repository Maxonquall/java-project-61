package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progressionCalc(String name) {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int lowerBorderOfSize = 6;
        final int upperBorderOfSize = 16;
        final int firstNumberLimit = 20;
        final int lowerBorderOfStep = 11;
        final int upperBorderOfStep = 2;
        var arraySize = random.nextInt(upperBorderOfSize - lowerBorderOfSize) + lowerBorderOfSize;
        int[] array = new int[arraySize];
        String[] arrayOfString = new String[arraySize];
        array[0] = random.nextInt(firstNumberLimit);
        arrayOfString[0] = Integer.toString(array[0]);
        var step = random.nextInt(upperBorderOfStep - lowerBorderOfStep) + lowerBorderOfStep;
        var missedNumber = random.nextInt(arraySize);
        for (int i = 1; i < arraySize; i++) {
            array[i] = array[i - 1] + step;
            arrayOfString[i] = Integer.toString(array[i]);
        }
        var correctAnswer = arrayOfString[missedNumber];
        arrayOfString[missedNumber] = "..";
        System.out.print("Question: ");
        for (int j = 0; j < arrayOfString.length - 1; j++) {
            System.out.print(arrayOfString[j] + " ");
        }
        System.out.println(arrayOfString[arrayOfString.length - 1]);
        System.out.print("Your answer: ");
        var answer = scanner.nextLine();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }

    }
}
