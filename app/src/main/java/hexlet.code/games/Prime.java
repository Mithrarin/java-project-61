package hexlet.code.games;

public class Prime {
    public static void rules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String question() {
        // Генерируем число от 1 до 100
        int question = 1 + (int) (Math.random() * 100);
        return Integer.toString(question);
    }

    public static String correctAnswer(String question) {
        int number = Integer.parseInt(question);
        // По умолчанию правильный ответ - "да".
        String correctAnswer = "yes";
        // Если число - единица, меняем правильный ответ на "нет".
        if (number == 1) {
            correctAnswer = "no";
        // в противном случае начинаем делить число на все значения по порядку.
        } else {
            for (var i = 2; i < number; i++) {
                // Если число делится без остатка на любое значение,
                // не являющееся единицей и самим делимым числом,
                // меняем правильный ответ на "нет" и прерываем цикл.
                if (number % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
        }
        return correctAnswer;
    }
}
