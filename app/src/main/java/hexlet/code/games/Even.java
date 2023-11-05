package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;


public class Even {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ARRAY_SIZE = 100;

    public static void even() {
        var name = Cli.greetings();
        String[] questions = new String[ARRAY_SIZE];
        String[] answers = new String[ARRAY_SIZE];
        for (int i = 0; i < questions.length; i++) {
            int number = Generator.getRandomInt(MIN, MAX);
            questions[i] = Integer.toString(number);
            answers[i] = isEven(number) ? "yes" : "no";
        }
        Engine.engine(TASK, name, questions, answers);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

