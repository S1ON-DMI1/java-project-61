package hexlet.code;

import hexlet.code.game.*;

import java.util.Scanner;

public class App {
    static final int EXIT_INPUT = 0;
    static final int GREET_INPUT = 1;
    static final int EVEN_INPUT = 2;

    static final int CALC_INPUT = 3;
    static final int GCD_INPUT = 4;
    static final int PROGRESSION_INPUT = 5;
    static final int PRIME_INPUT = 6;
     static final Scanner SCANNER = new Scanner(System.in);
     private static int input;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("Your choice: " + input);

        switch (input) {
            case EXIT_INPUT -> System.out.println("Exit");
            case GREET_INPUT -> Cli.getName();
            case EVEN_INPUT -> Even.evenGame();
            case CALC_INPUT -> Calc.calcGame();
            case GCD_INPUT -> GCD.gcdGame();
            case PROGRESSION_INPUT -> Progression.progressionGame();
            case PRIME_INPUT -> Prime.primeGame();
            default -> System.out.println("Something wrong");
        }
    }
}
