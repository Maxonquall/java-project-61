package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var key = false;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
                while (!key && in.hasNextInt()) {
                    var game = in.nextInt();
                    switch (game) {
                        case 0:
                            System.out.println("Exit");
                            key = true;
                            break;
                        case 1:
                            Cli greetings = new Cli();
                            greetings.greetings();
                            key = true;
                            break;
                        case 2:
                            Even number = new Even();
                            number.isEven();
                            key = true;
                            break;
                        default:
                            System.out.println("Wrong number\n" +
                                    "1 - Greet\n0 - Exit\n");
                            System.out.print("Your choice: ");
                    }
                }
               /* if (!in.hasNextInt()) {
                    System.out.println("Please reboot program and use number");
                }*/
            in.close();
            }

    }

