package hexlet.games;

import java.util.Random;


public class Calc {
    public static String whatIsResult() {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        final int numberOneRandomLimit = 100;
        final int numberTwoRandomLimit = 100;
        final int operationTypes = 3;
        var numberOne = random.nextInt(numberOneRandomLimit);
        var numberTwo = random.nextInt(numberTwoRandomLimit);
        var operation = random.nextInt(operationTypes);
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
}
