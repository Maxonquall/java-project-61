package hexlet.code;

import hexlet.games.Cli;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var gameIdentifierIsCorrect = false;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n0 - Exit");
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
                            Engine.engine("2");
                            gameIdentifierIsCorrect = true;
                            break;
                        case "3":
                            Engine.engine("3");
                            gameIdentifierIsCorrect = true;
                            break;
                        case "4":
                            Engine.engine("4");
                            gameIdentifierIsCorrect = true;
                            break;
                        default:
                            System.out.println("Wrong number\n1 - Greet\n2 - Even\n3 - Calc\n4 - GSD\n0 - Exit");
                            System.out.print("Your choice: ");
                    }
                }
            in.close();
            }

    }

