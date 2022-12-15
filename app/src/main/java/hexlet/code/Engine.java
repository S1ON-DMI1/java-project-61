package hexlet.code;

import java.util.Scanner;
import hexlet.code.game.Calc;
public class Engine {
    public static int ROUNDS = 3;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String userName = getName();

    public static String getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void play(String ruleQuestion, String[][] questionsAndAnswers) {
        System.out.println(ruleQuestion);

        for (String[] questionAndAnswer : questionsAndAnswers) {
            System.out.println(questionAndAnswer[0]);
            String userAnswer = SCANNER.nextLine();


            if (!userAnswer.equals(questionAndAnswer[1])) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + questionAndAnswer[1]);
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Your answer: " + userAnswer);
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getROUNDS() {
        return ROUNDS;
    }
    public static int generateNumber(int a) {
        return (int) (Math.random() * a);
    }

    public static int generateNumber(int a, int b) {
        return (int) (Math.random() * a) + b;
    }
}
