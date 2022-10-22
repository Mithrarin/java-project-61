package hexlet.code;

import java.util.Scanner;

class Calc {
    public static void game() {
        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        // Игра
        var attempts = 0;
        while (attempts < 3) {
            // Генерируем первое число
            int firstNumber = (int) (Math.random() * 100);
            // Генерируем следующее число
            int secondNumber = (int) (Math.random() * 100);
            // Генерируем производимую операцию
            int operationNumber = (int) (Math.random() * 3);
            String question;
            int correctAnswer;
            if (operationNumber == 0) {
                question = firstNumber + " + " + secondNumber;
                correctAnswer = firstNumber + secondNumber;
            } else if (operationNumber == 1) {
                question = firstNumber + " - " + secondNumber;
                correctAnswer = firstNumber - secondNumber;
            } else {
                question = firstNumber + " * " + secondNumber;
                correctAnswer = firstNumber * secondNumber;
            }
            // Задаем вопрос
            System.out.println("Question: " + question);
            System.out.println("Your answer:");
            Scanner sc1 = new Scanner(System.in);
            int answer = sc1.nextInt();
            // Проверяем ответ
            if (answer == correctAnswer) {
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
