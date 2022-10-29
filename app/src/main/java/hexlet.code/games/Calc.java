package hexlet.code.games;

public class Calc {
    public static void rules() {
        System.out.println("What is the result of the expression?");
    }

    public static String question() {
        // Генерируем первое число
        int firstNumber = (int) (Math.random() * 100);
        // Генерируем следующее число
        int secondNumber = (int) (Math.random() * 100);
        // Генерируем производимую операцию
        int operationNumber = (int) (Math.random() * 3);
        // Задаем вопрос
        String question;
        if (operationNumber == 0) {
            question = firstNumber + " + " + secondNumber;
        } else if (operationNumber == 1) {
            question = firstNumber + " - " + secondNumber;
        } else {
            question = firstNumber + " * " + secondNumber;
        }
        return question;
    }

    public static String correctAnswer(String question) {
        // Извлекаем значения из вопроса
        var objects = question.split(" ");
        int firstNumber = Integer.parseInt(objects[0]);
        int secondNumber = Integer.parseInt(objects[2]);
        var operator = objects[1];
        int correctAnswer;
        // Определяем оператор, примененный в вопросе,
        // и вычисляем правильный ответ
        switch (operator) {
            case "+":
                correctAnswer = firstNumber + secondNumber;
                break;
            case "-":
                correctAnswer = firstNumber - secondNumber;
                break;
            default:
                correctAnswer = firstNumber * secondNumber;
                break;
        }
        return Integer.toString(correctAnswer);
    }
}
