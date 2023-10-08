package hexlet.code;

import hexlet.games.Calc;
import hexlet.games.Cli;
import hexlet.games.Even;
import hexlet.games.GSD;


public class Engine {
    public static void engine(String gameIdentifier) {
        String name = Cli.greetings();
        var count = 0;
        switch (gameIdentifier) {
            case "2":
                while (count < 3) {
                    Even.isEven(name);
                    count++;
                }
                break;
            case "3":
                while (count < 3) {
                    Calc.calculate(name);
                    count++;
                }
            case "4":
                while (count < 3) {
                    GSD.gcd(name);
                    count++;
                }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}


