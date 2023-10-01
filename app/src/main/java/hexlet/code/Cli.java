package hexlet.code;
import java.util.Scanner;
public class Cli {
    private String name;
    public String greetings() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
        in.close();
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }
}
