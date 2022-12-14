package hexlet.code.game;

import hexlet.code.Engine;

public class GCD {
    private static final int RANDOM_NUMBER = 3;
    static final String MAIN_QUESTION  = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = Engine.generateNumber(RANDOM_NUMBER, 1);
            int secondNumber = Engine.generateNumber(RANDOM_NUMBER, 1);

            questionsAndAnswers[i][0] = "Question: " + firstNumber + " " + secondNumber;
            questionsAndAnswers[i][1] = Integer.toString(getGCD(firstNumber, secondNumber));
        }
        Engine.play(MAIN_QUESTION, questionsAndAnswers);
    }
    private static int getGCD(int first, int second) {
        while (second != 0) {
            int temp = first % second;
            first = second;
            second = temp;
        }
        return first;
    }
}
