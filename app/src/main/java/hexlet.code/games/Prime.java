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
        String correctAnswer = "yes";
        if (number == 1) {
            correctAnswer = "no";
        } else {
            for (var i = 2; i < number; i++) {
                if (number % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }
        }
        return correctAnswer;
    }
}