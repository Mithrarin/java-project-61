package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class Engine {
    public static void game(int number) {
        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        // Правила
        switch (number) {
            case 2:
                Even.rules();
                break;
            case 3:
                Calc.rules();
                break;
            case 4:
                GCD.rules();
                break;
            case 5:
                Progression.rules();
                break;
        }
        // Игра
        var attempts = 0;
        while (attempts < 3) {
            String question = null;
            String correctAnswer = null;
            switch (number) {
                case 2:
                    question = Even.question();
                    correctAnswer = Even.correctAnswer(question);
                    break;
                case 3:
                    question = Calc.question();
                    correctAnswer = Calc.correctAnswer(question);
                    break;
                case 4:
                    question = GCD.question();
                    correctAnswer = GCD.correctAnswer(question);
                    break;
                case 5:
                    question = Progression.question();
                    correctAnswer = Progression.correctAnswer(question);
                    break;
            }
            // Задаем вопрос
            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            Scanner sc1 = new Scanner(System.in);
            String answer = sc1.next();
            // Проверяем ответ
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                attempts += 1;
                // Проверяем - не пора ли поздравлять
                if (attempts == 3) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }
}
