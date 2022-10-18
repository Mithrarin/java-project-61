package hexlet.code;

import java.util.Scanner;

class Even {
    public static void game() {
        // Приветствие
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        // Игра
        var attempts = 0;
        while (attempts < 3) {
            // Гененрируем случайное число
            int number = (int) (Math.random() * 100);
            // Определяем четность числа
            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            // Задаем вопрос
            System.out.println("Question: " + number);
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
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }
}
