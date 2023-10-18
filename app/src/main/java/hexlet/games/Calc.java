package hexlet.games;

import java.util.Random;


public class Calc {
    public static String whatIsResult() {
        System.out.println("What is the result of the expression?");
        var numberOne = generateNumber();
        var numberTwo = generateNumber();
        var operation = generateOperation();
        var symbol = "";
        var result = 0;
        var resultToString = "";
        switch (operation) {
            case 0:
                symbol = "+";
                result = numberOne + numberTwo;
                resultToString = Integer.toString(result);
                break;
            case 1:
                symbol = "-";
                result = numberOne - numberTwo;
                resultToString = Integer.toString(result);
                break;
            case 2:
                symbol = "*";
                result = numberOne * numberTwo;
                resultToString = Integer.toString(result);
                break;
            default:
                break;
        }
        System.out.println("Question: " + numberOne + " " + symbol + " " + numberTwo);
        return resultToString;
    }
    private static int generateNumber() {
        Random random = new Random();
        final int numberOneRandomLimit = 100;
        return random.nextInt(numberOneRandomLimit);
    }
    private static int generateOperation() {
        Random random = new Random();
        final int operationTypes = 3;
        return random.nextInt(operationTypes);
    }
}
