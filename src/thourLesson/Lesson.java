package thourLesson;

import java.util.Arrays;
import java.util.Objects;

public class Lesson {
    public static void main(String[] args) {
        //char 16 символов если не влезает то представляется парой символов(суррогатная пара) чаров
        char char1 = 'J';// сам символ в одинарных ковычках
        char char2 = 74; // номер символа
        char char3 = '\u0044'; // шестнадацитричное представление

        System.out.println("\nСтроки");
        //Строки - упорядаченныная последовательность символов
        //Строки - обьект (ссылочный тип) классаа  String
        //Строки задаются:
        // в " "
        //new String испольовуется только при необходимости
        //Строки нельзя изменить,можно только создать новую на основе существующей
        // Все строковые литералы,например System.out.println("Строки");
        // Как экземпляры String
        char[] jjdChars = {};
        String jjdString = new String(jjdChars);
        jjdString = "\u004A\u004A\u0044";
        System.out.println(jjdString.length());

        char[] frogChars = {'\uD83D', '\uDC38'};
        String frogString = new String(frogChars);
        frogString = "\uD83D\uDC38";
        System.out.println(frogString);
        System.out.println(frogString.length());
        System.out.println(frogString.codePoints().count());

        //Хранение строк до java 9: массив char[] в кодировке UTF-16;
        //при этом каждый char  бфл представлен двумя байтами

        //храненеи строк начиная с java(компактные строки)

        System.out.println("Пул строк");
        //пул строк (находится в heap памяти) хранит только одну  копию каждого строкового литерала
        String string1 = "Строка";
        String string2 = "Строка";
        //Почитать про пул строк в Java.
        String string3 = new String("Строка");
        //через new создаётся вне пула строк, а как отдельная ячейка памяти в следствии чего можно наплодить вагон всего и засрать всю память
        System.out.println(string1 == string2);// сравнивает ссылки и будет true
        System.out.println(string1 == string3);// будет false
        //помещение сторки в пул строк называется интернирование - храние там одной копии
        System.out.println("Метод intern()");
        String internStr = string3.intern();// interStr будет занесён в пул строк  со значение str3
        System.out.println(string1 == internStr);//true
        System.out.println(string3 == internStr);//false
        System.out.println(string1);

        System.out.println("Сравнение строк - equals()");
        string1 = "Стровка";
        string2 = "Строка";
        System.out.println(string1.equals(string1));// true
        System.out.println("строка".equals(string1));// false equals - сравнивает по байтово с учётом регистра
        System.out.println("строка".equalsIgnoreCase(string1));//true - тут сравнение идёт без учёта регистр

        String nullString = null;
        System.out.println(nullString == null);//true
        System.out.println(null == null);//true
        System.out.println(Objects.nonNull(nullString));//false
        System.out.println(Objects.isNull(nullString));//true

        //Дан массив animals {"Кот","пёс","гусь}"
        String[] animals = new String[]{"кот", "пёс", "гусь"};
        String[] newAnimals = new String[animals.length * 2];
        for (int i = 0; i < newAnimals.length; i++) {
            newAnimals[i] = animals[(int) (Math.random() * animals.length)];
        }
        System.out.println(Arrays.toString(newAnimals));
        System.out.println("Конкатенцаия строк");
        string1 = "Java";
        string2 = "Pathon";
        //1 вариант: +
        System.out.println(string1 + " :: " + string1);

        //2 вариант
        //Воспользоваться методом
        String concatStr = string1.concat(" :: ").concat(string2);

        //3 вариант: String.join(разделитель(может быть просто пробелом), строка1,строка2,строкаN);
        concatStr = String.join(" :: ", string1, string2);

        //все эти варинаты ведут к созданию нового обьекта
        //StringBuilder - работает быстрее, но не является потокобезопасным( не юзать в многопоточке),не создаёт новый обьект
        //StringBuffer - работает медленнее, но потокобезопасен;

        StringBuilder sb = new StringBuilder(string1);//Обьекты в стринг билдере не являются строкой,
        // следовательно для вывода надо преобразовать его в строку
        sb.append(" :: ").append(string2);//добавит в билдер
        System.out.println(sb.toString());

        sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(" ");
        }
        concatStr = sb.toString();


        //Результат сравенения этих методов всегда буля
        //сравнение строк
        string1 = "Строка";
        string2 = "Строка";

        System.out.println("строка".compareTo("Строка"));//32
        System.out.println("строка".compareTo("строка"));//0
        System.out.println("Строка".compareTo("строка"));//-32
        System.out.println("строка".equalsIgnoreCase("Строка"));//0

        //start/end
        string1 = "JJD";
        System.out.println(string1.startsWith("JJ"));//true
        System.out.println(string1.startsWith("D", 2));// 2 это с какого символа начётся просмотр
        System.out.println(string1.endsWith("d"));//false

        //Приведение к регистру
        string1 = string1.toLowerCase();//Заносит новую строку в пулср
        string1 = string1.toUpperCase();//

        //Почитать больше  про регулярные выражения
        //Замена
        string1 = "JDD";
        string1 = string1.replace("j", "!");
        System.out.println(string1);
        string1 = "JJD";
        string1 = string1.replaceAll("J", "!");// !!D
        string1 = string1.replaceAll("J", "?");//результат строка
        string1 = string1.replaceFirst("!", "D"); // замена первого совпадения

        System.out.println(string1.contains("D"));//Результат буля

        string1 = "Java Python PHP";
        String[] strings = string1.split(""); //  По разделителю формирует элемнт массива [Java, Python, PHP]
        System.out.println(Arrays.toString(strings));

        //убрать пробелы trim / strip/stripLeading/ stripTrailing
        System.out.println("\u3000"); // "   "
        System.out.println("\u3000"); // " "
        //trim - убират пространство меньше или равно u0020
        //strip - убирает любое пространсто
        //stripTrailing - убирает любое пространство(начало строки)
        //stripTrailing - убирает любое пространоств(конец стркои)
    }
}
