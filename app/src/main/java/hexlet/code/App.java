package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Cli;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        var game = in.nextLine();
        switch (game) {
            case "0" -> System.out.println("Exit");
            case "1" -> Cli.greetings();
            case "2" -> Even.playEven();
            case "3" -> Calc.playCalc();
            case "4" -> GCD.playGcd();
            case "5" -> Progression.playMissingNumber();
            case "6" -> Prime.playIsPrime();
            default -> System.out.println("Wrong number");
        }
    }
}

