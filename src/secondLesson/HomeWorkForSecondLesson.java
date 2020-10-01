package secondLesson;

import java.util.Scanner;

public class HomeWorkForSecondLesson {
    public static void main(String[] args) {
//      1.Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ...

        int x = 1;
        int whileY = 0;
        while (whileY < 20) {
            x = x * 2;
            whileY++;
            System.out.println(x);
        }


        int forX = 1;
        for (int i = 0; i < 20; i++) {
            forX = forX * 2;
            System.out.println(forX);
        }

//       2.Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
//        Ps.Луше было сделать в for так как переменная остаётся болтаться хз зачем.
        int whileX = 90;
        while (whileX != 0) {
            System.out.println(whileX);
            whileX = whileX - 5;
        }
//
//       3.Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
//       Примеры работы программы:
//       Число 345 не содержится в интервале (25;200)
//       Число 110 содержится в интервале (25;200)
//
        int mathRandom = (int) (10 + Math.random() * 500);
        if (mathRandom > 25 && mathRandom < 100)
            System.out.println("Ваше число " + mathRandom + " содержится в интервале [25;100]");
        else System.out.println("Ваше число " + mathRandom + " не содержится в интервале [25;100]");

//       4.Задача на синтаксис switch. Дана целочисленная переменная (номер билета от пользователя):
//       если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
//       если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
//       если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
//       В остальных случаях сообщить, что приза нет.

        int ticketNumber = 111;
        switch (ticketNumber) {
            case 111:
            case 222:
            case 333:
                System.out.println("Вы выиграли Книгу");
                break;
            case 444:
            case 555:
                System.out.println("Вы выиграли Телефон");
                break;
            case 776:
                System.out.println("Вы выиграли Ноутбук");
                break;
            default:
                System.out.println("Приза нет");
                break;
        }

        /*
         Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        если введен 0, выводит "выход из программы" (программа завершает работу)
         */

        int generatedNumber = (int) (1 + Math.random() * 9);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Прогрмма закадывает число от 1 до 9 , вам нужено угадать число!");
        System.out.print(generatedNumber + " Введите ваше чило: ");

        int playerNumber = scanner.nextInt();
        while (true) {
            if (playerNumber == generatedNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (playerNumber > generatedNumber && playerNumber != 0) {
                System.out.println("Загаданное число больше");
                System.out.println("Введите новое число");
                playerNumber = scanner.nextInt();
            } else if (playerNumber < generatedNumber && playerNumber != 0) {
                System.out.println("Загаднное число миньше");
                System.out.println("Введите новое число");
                playerNumber = scanner.nextInt();
            } else if (playerNumber == 0) {
                System.out.println("Вы ввели 0, программа завершается");
                break;
            }
        }
        //Пользователь! загадывает число в диапазоне от [1 до 100], программа пытается его угадать (используйте метод бинарного поиска - деление отрезка на 2).
        //Программа может задавать пользователю вопросы: Число равно X? / Число больше X? / Число меньше X? и в зависимоти от ответа пользователя принимать решения.
        //PS: вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

        int min = 1;
        int max = 100;
        int midl = (min + max) / 2;
        int yourNumber = 0;
        System.out.println("Вам нужно закадать число от 1 до 100,а програма будет его угадывать");
        System.out.println("Начнём? 0/Нет 1/Да");
        int answer = scanner.nextInt();
        if (answer == 0) {
            System.out.println("Очень жаль");
        } else {
            while (yourNumber != midl) {
                System.out.println("Ваше число " + midl + "?" + " 0/Нет 1/Да");
                answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Ваше чило " + midl + "!" + " Игра закончена");
                    yourNumber = midl;
                } else if (answer == 0) {
                    System.out.println("Ваше число меньше " + midl + "?" + " 0/Нет 1/Да");
                    answer = scanner.nextInt();
                    if (answer == 0) {
                        min = midl;
                    } else if (answer == 1) {
                        max = midl;
                    }
                    System.out.println(midl);
                }
                midl = (min + max) / 2;
            }
        }
    }
}



