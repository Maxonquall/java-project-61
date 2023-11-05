package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static void engine(String task, String name, String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        System.out.println(task);
        while (round < ROUND_COUNT) {
            System.out.println("Question: " + questions[round]);
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();
            if (userAnswer.equals(answers[round])) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answers[round] + "'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);

    }
}


