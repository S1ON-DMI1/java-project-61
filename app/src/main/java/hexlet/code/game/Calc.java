package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {
    private static final int RANDOM_NUMBER = 1000;
    private static final int RANDOM_NUMBER_FOR_OPERAND = 3;
    private static int arithmeticResult;
    private static final String mainQuestion = "What is the result of the expression?";

    public static void calcGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int firstNumber = Engine.generateNumber(RANDOM_NUMBER);
            int secondNumber = Engine.generateNumber(RANDOM_NUMBER);
            String arithmeticOperand = getArithmeticOperand();
            questionsAndAnswers[i][0] = getQuestion(firstNumber, secondNumber, arithmeticOperand);
            questionsAndAnswers[i][1] = Integer.toString(getAnswer(firstNumber, secondNumber, arithmeticOperand));
        }

        Engine.play(mainQuestion, questionsAndAnswers);
    }

    private static String getQuestion(int first, int second, String arithmeticOperand) {
        return "Question: " + first + " " + arithmeticOperand + " " + second;
    }

    private static int getAnswer(int firstNumber, int secondNumber, String operandSwitch) {
        switch (operandSwitch) {
            case "*" -> setArithmeticResult(firstNumber * secondNumber);
            case "+" -> setArithmeticResult(firstNumber + secondNumber);
            case "-" -> setArithmeticResult(firstNumber - secondNumber);
            default -> System.out.println("Something wrong");
        }
        return arithmeticResult;
    }

    public static void setArithmeticResult(int result) {
        arithmeticResult = result;
    }

    private static String getArithmeticOperand() {

        int random = Engine.generateNumber(RANDOM_NUMBER_FOR_OPERAND);
        String[] operand = {"*", "+", "-"};
        return operand[random];
    }
}