package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    private static final int END_NUMBER = 100500;
    private static int randomNumber;
    private static final String MAINQUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {

        String[][] questionsAndAnswers = new String[Engine.getROUNDS()][2];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i][0] = getQuestion();
            questionsAndAnswers[i][1] = getAnswer();
        }

        Engine.play(MAINQUESTION, questionsAndAnswers);
    }

    public static String getAnswer() {
        if (randomNumber % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static String getQuestion() {
        randomNumber = (int) (Math.random() * END_NUMBER);
        return "Question: " + randomNumber;
    }
}
