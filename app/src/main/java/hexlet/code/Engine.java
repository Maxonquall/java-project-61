package hexlet.code;

import hexlet.games.Even;
import hexlet.games.Cli;
import hexlet.games.Calc;
import hexlet.games.GSD;
import hexlet.games.Progression;
import hexlet.games.Prime;

public class Engine {
    public static void engine(String gameIdentifier) {
        String name = Cli.greetings();
        final int countOfGames = 3;
        var count = 0;
        switch (gameIdentifier) {
            case "2":
                while (count < countOfGames) {
                    Even.isEven(name);
                    count++;
                }
                break;
            case "3":
                while (count < countOfGames) {
                    Calc.calculate(name);
                    count++;
                }
            case "4":
                while (count < countOfGames) {
                    GSD.gcdCalc(name);
                    count++;
                }
            case "5":
                while (count < countOfGames) {
                    Progression.progressionCalc(name);
                    count++;
                }
            case "6":
                while (count < countOfGames) {
                    Prime.primeCalc(name);
                    count++;
                }
            default:
                break;
        }
        if (count == countOfGames) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}


