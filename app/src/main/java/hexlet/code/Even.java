package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public void isEven() {
        var count = 0;
        Random random = new Random();
        Scanner inName = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = inName.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            int number = random.nextInt(100) + 1;
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var answer = in.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'" );
                System.out.println("Let's try again, " + name + "!");
                count = count + 10;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
        in.close();



    }
}
       /* Cli greetings = new Cli();
        greetings.greetings();
        String user = greetings.getName();*/