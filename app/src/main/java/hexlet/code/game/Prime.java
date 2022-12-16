package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {
    private static final int RANDOM_NUMBER = 50;
    static final String mainQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int randomNumber = Engine.generateNumber(RANDOM_NUMBER, 1);

            questionsAndAnswers[i][0] = "Question: " + randomNumber;
            questionsAndAnswers[i][1] = getAnswer(randomNumber);
        }

        Engine.play(mainQuestion, questionsAndAnswers);
    }

    private static String getAnswer(int randomNumber) {
        if (randomNumber <= 1) {
            return "no";
        }
        for (int i = 2; i <= randomNumber / 2; i++) {
            if ((randomNumber % i) == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
