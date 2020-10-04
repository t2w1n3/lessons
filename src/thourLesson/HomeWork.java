package thourLesson;

import javax.lang.model.element.NestingKind;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Задание 1
        Заполнить массив
        Задать массив на N слов
        В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
        В итоге в массиве будут только уникальные слова.
        Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
        Перед завершением программы, вывести получившийся массив в консоль
         */

        System.out.println("Массив какой длинны вы бы хотели создать? (Введите произвольное целое числло от 1 до N)");
        System.out.println("Массив может состоять только из уникальных элементов");
        Scanner scanner = new Scanner(System.in);
        int arrayLong = scanner.nextInt();

        String[] worldArray = new String[arrayLong];

        int check = 0;

        String word;
        for (int i = 0; i < worldArray.length; i++) {
            System.out.println("Введите слово которое вы хотите добавить в массив." +
                    " Если вы хотите завершить работу с программой введите 'exit' " +
                    "В массиве осталось " + (worldArray.length - i) + " незаполненых элементов");
            word = scanner.next();
            if (word.equals("exit")) {
                System.out.println("Вы решили завершить программу");
                break;
            } else if (i == 0) {
                worldArray[i] = word;
            } else if (i > 0) {
                while (check < i) {
                    if (worldArray[check].equals(word)) {
                        System.out.println("Ваше слово уже содержится в массиве,введите новое слово");
                        word = scanner.next();
                    } else {
                        check++;
                    }
                }
                if (!word.equals("exit")) {
                    worldArray[i] = word;
                    check = 0;
                }
            }
        }
            System.out.println(Arrays.toString(worldArray));

        /*
        Задние №2
        Найти количество вхождений одной строки в другую.
        Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
         */
            System.out.println("Введите строку для поиска количества вхождений");
            String line = scanner.nextLine();
            System.out.println("Введите предложеине для поиска заднной строки");
            String lineForSearch = scanner.nextLine();
            System.out.println(lineForSearch.split(line).length - 1);

        /*
            Задание №3
            Написать функцию, которая проверяет, является ли строка палиндромом.
            Палиндром — это число, буквосочетание, слово или текст,
            которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
         */

        System.out.println("Введите слово которое вы считает палиндромом");
        String userString = scanner.nextLine();
        StringBuilder checkPolindrom = new StringBuilder(userString);
        checkPolindrom.reverse();
        if (checkPolindrom.toString().equals(userString)) System.out.println("Ваше слово явлется полиндромом");
        else System.out.println("Ваше слово не явлется полиндромом");

        /*
        Задача 4
        Заменить все буквы в слове на строчные, а первую букву на заглавную
        Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
         */

        System.out.println("Данная программа заменит все буквы в слове на строчные, а первую букву на заглавную, введите ваше слово");
        String string4 = scanner.nextLine();
        StringBuilder firstUpperCase = new StringBuilder(string4.toLowerCase());
        firstUpperCase.setCharAt(0,Character.toUpperCase(firstUpperCase.charAt(0)));
        firstUpperCase.toString();
        System.out.println(firstUpperCase);

       /*
        Задача 5
        Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
        Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
         */
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        String maxWord = " ";
        String[] massSentence = sentence.split(" ");
        for (int i = 0, j = 0; i < massSentence.length; i++) {
            if (massSentence[j].length() > massSentence[i].length()) {
                maxWord = massSentence[j];
            } else {
                maxWord = massSentence[i];
            }
        }
        System.out.println("Самое большое слово в вашем предложение: " + maxWord);
    }
}


