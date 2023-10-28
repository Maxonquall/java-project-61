package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var gameIdentifierIsCorrect = false;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        while (!gameIdentifierIsCorrect) {
            var game = in.nextLine();
            switch (game) {
                case "0":
                    System.out.println("Exit");
                    gameIdentifierIsCorrect = true;
                    break;
                case "1":
                    Cli.greetings();
                    gameIdentifierIsCorrect = true;
                    break;
                case "2":
                    Even.even();
                    gameIdentifierIsCorrect = true;
                    break;
                case "3":
                    Calc.calc();
                    gameIdentifierIsCorrect = true;
                    break;
                case "4":
                    GSD.gsd();
                    gameIdentifierIsCorrect = true;
                    break;
                case "5":
                    Progression.whatNumberIsMissing();
                    gameIdentifierIsCorrect = true;
                    break;
                case "6":
                    Prime.isPrime();
                    gameIdentifierIsCorrect = true;
                    break;
                default:
                    System.out.println("Wrong number\n1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n"
                                    + "5 - Progression\n6 - Prime\n0 - Exit");
                    System.out.print("Your choice: ");
            }
        }
    }

}

