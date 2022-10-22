package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        System.out.println("Your choice: " + number);
        if (number == 1) {
            Cli.greeting();
        } else if (number == 2 || number == 3) {
            Engine.game(number);
        }
    }
}
