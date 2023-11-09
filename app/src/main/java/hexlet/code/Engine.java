package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void play(String task, String name, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        System.out.println(task);
        while (round < ROUND_COUNT) {
            System.out.println("Question: " + rounds[round][QUESTION]);
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(rounds[round][ANSWER])) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rounds[round][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + name + "!");
    }
}


