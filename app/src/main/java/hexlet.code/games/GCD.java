package hexlet.code.games;

public class GCD {
    public static void rules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String question() {
        // Генерируем первое число
        int firstNumber = 1 + (int) (Math.random() * 100);
        // Генерируем следующее число
        int secondNumber = 1 + (int) (Math.random() * 100);
        // Возвращаем вопрос
        return firstNumber + " " + secondNumber;
    }

    public static String correctAnswer(String question) {
        // Извлекаем значения из вопроса
        var objects = question.split(" ");
        int firstNumber = Integer.parseInt(objects[0]);
        int secondNumber = Integer.parseInt(objects[1]);
        // Определяем меньшее и большее числа
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int greaterNumber = Math.max(firstNumber, secondNumber);
        // Формируем цикл для нахождения НОД
        int correctAnswer = 1;
        int divider = 1;
        // Перебираем делители от единицы до половины значения меньшего числа
        while (divider <= smallerNumber / 2) {
            // Если меньшее число делится без остатка
            // и большее число делится без остатка на результат этого деления,
            // значит результат деления меньшего числа на текущий делитель
            // является НОД-ом. Его и возвращаем.
            if (smallerNumber % divider == 0 && greaterNumber % (smallerNumber / divider) == 0) {
                    correctAnswer = smallerNumber / divider;
                    return Integer.toString(correctAnswer);
            // В противном случае переходим к следующему делителю
            } else {
                divider += 1;
            }
        }
        // Если цикл ничего не вернул, значит НОД меньше 2
        // В таком случае возвращаем НОД = 1
        return Integer.toString(correctAnswer);
    }
}
