package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;


public class Progression {
    public static final String TASK = "What number is missing in the progression?";
    public static final int MIN = 0;
    public static final int ARRAY_SIZE = 100;
    public static final int MIN_SIZE_ARRAY = 5;
    public static final int MAX_SIZE_ARRAY = 16;
    public static final int MAX_FIRST_NUMBER = 20;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 11;

    public static void whatNumberIsMissing() {
        var name = Cli.greetings();
        String[] questions = new String[ARRAY_SIZE];
        String[] answers = new String[ARRAY_SIZE];
        for (int i = 0; i < questions.length; i++) {
            var aps = generateArray();
            var missedNumber = Generator.getRandomInt(MIN, aps.length);
            answers[i] = aps[missedNumber];
            aps[missedNumber] = "..";
            questions[i] = String.join(" ", aps);
        }
        Engine.engine(TASK, name, questions, answers);
    }

    private static String[] generateArray() {
        var arraySize = Generator.getRandomInt(MIN_SIZE_ARRAY, MAX_SIZE_ARRAY);
        int[] numbers = new int[arraySize];
        numbers[0] = Generator.getRandomInt(MIN, MAX_FIRST_NUMBER);
        var step = Generator.getRandomInt(MIN_STEP, MAX_STEP);
        String[] numbersToString = new String[arraySize];
        numbersToString[0] = Integer.toString(numbers[0]);
        for (int i = 1; i < arraySize; i++) {
            numbers[i] = numbers[i - 1] + step;
            numbersToString[i] = Integer.toString(numbers[i]);
        }
        return numbersToString;

    }
}
