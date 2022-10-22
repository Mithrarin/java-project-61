package hexlet.code.games;

public class Even {
    public static void rules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String question() {
        // Генерируем случайное число
        int question = (int) (Math.random() * 100);
        return Integer.toString(question);
    }

    public static String correctAnswer(String question) {
        // Определяем четность числа
        String correctAnswer;
        if (Integer.parseInt(question) % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
}
