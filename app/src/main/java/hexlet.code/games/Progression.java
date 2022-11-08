package hexlet.code.games;

public class Progression {
    public static void rules() {
        System.out.println("What number is missing in the progression?");
    }

    public static String question() {
        // Генерируем длину прогрессии (от 5 до 10)
        int progressionLength = 5 + (int) (Math.random() * 6);
        // Создаем массив соответствующей длины
        int[] progression = new int[progressionLength];
        // Генерируем значение первого члена прогрессии (от 0 до 20)
        // и записываем его в массив
        int firstNumber = (int) (Math.random() * 21);
        progression[0] = firstNumber;
        // Генерируем значение шага прогрессии (от 1 до 10)
        int commonDifference = 1 + (int) (Math.random() * 10);
        // Наполняем массив остальными членами прогрессии
        for (var i = 1; i < progression.length; i++) {
            int previousNumber = progression[i - 1];
            int nextNumber = previousNumber + commonDifference;
            progression[i] = nextNumber;
        }
        // Генерируем позицию спрятанного элемента
        int hiddenElementPosition = (int) (Math.random() * progression.length);
        // Переводим массив в строку,
        // заменяя один из элементов прогрессии двумя точками
        var question = new StringBuilder();
        for (var i = 0; i < progression.length; i++) {
            if (i == hiddenElementPosition) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }
        return question.toString();
    }

    public static String correctAnswer(String question) {
        var progression = question.split(" ");
        int correctAnswer = 0;
        for (var i = 0; i < progression.length; i++) {
            if (progression[i].equals("..")) {
                if (i < 2) {
                    int nextNumber1 = Integer.parseInt(progression[i + 1]);
                    int nextNumber2 = Integer.parseInt(progression[i + 2]);
                    correctAnswer = nextNumber1 - (nextNumber2 - nextNumber1);
                } else {
                    int previousNumber1 = Integer.parseInt(progression[i - 1]);
                    int previousNumber2 = Integer.parseInt(progression[i - 2]);
                    correctAnswer = previousNumber1 + (previousNumber1 - previousNumber2);
                }
            }
        }
        return Integer.toString(correctAnswer);
    }
}
