package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    private static final int NUMBER_START = 10;
    private static final int NUMBER_END = 5;
    private static String guessNumber;
    private static String mainQuestion = "What number is missing in the progression?";

    public static void progressionGame() {

        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            questionsAndAnswers[i][0] = getQuestion();
            questionsAndAnswers[i][1] = getAnswer();
        }

        Engine.play(mainQuestion, questionsAndAnswers);
    }

    private static String getAnswer() {
        return guessNumber;
    }

    private static String getQuestion() {
        int start = Engine.generateNumber(NUMBER_START, NUMBER_END);
        int length = Engine.generateNumber(NUMBER_END, NUMBER_START);
        int step = Engine.generateNumber(NUMBER_START, 1);

        String[] array = new String[length];
        array[0] = Integer.toString(start);

        for (int i = 1; i <= array.length - 1; i++) {
            int temp = Integer.parseInt(array[i - 1]);
            array[i] = Integer.toString(temp + step);
        }

        int randomArrayIndex = Engine.generateNumber(array.length - 1, 1);
        guessNumber = (array[randomArrayIndex]);
        array[randomArrayIndex] = "..";

        return "Question: " + String.join(" ", array);
    }
}
