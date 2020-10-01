package secondLesson;

import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        //if else
//        if (услоиве) {
//            набор инструкций
//        }
//        else if (условие){
//            набор иструкций
//        }
//        else{
//            набор инструкций если всё просралось
//        }
        int sate = 0;
        //0 -  вывусти на экран "Вывести на экран закрытие приложения"
        //1 -  вывести на экран "Запуск приложения"
        // В остальных случаях "ошибка статуса"

        if (sate == 0) System.out.println("Закрытие приложения");
        else if (sate == 1) System.out.println("Запуск приложения");
        else System.out.println("Ошибка статуса");

        //Логический операторы
        //Всегда возвращает булю
        //&& - И
        // || - Или
        // ! - не
        //^ - исклчающие или вёрнят true  только если одно из значений true а дргое false

//        int age = 10;
//        int exp = 11;
//        (age > 30 && exp >7)//false
//        (age > 30 || exp > 7)//true
//        !(age > 30|| exp > 7)//false
//        is Closed = false
//        !isClosed //true
        // (state == 0 ^ code > 100) // false

        int count = 90;
        if (count >= 90 || count == 100) System.out.println("Ваша оценка 5");
        else if (count >= 60 || count == 89) System.out.println("Ваша оценка 4");
        else if (count >= 40 || count == 59) System.out.println("Ваша оценка 3");
        else if (count == 0 || count <= 39) System.out.println("Ваша оценка 2");
        else {
            System.out.println("Ошибка ввода");
        }

        /* switch (Выражение){
        case1 значения/выражения:
        инструкция;
        break;

        case2 значение / выражение:
        инструкция;
        break;

        default:
        инструкция
        break;

        выражение / переменной могут быть :
        byte(Byte),short(Short),char(Character),int (Integer)
        enum,String
         */
    int sum = 10000;
    int code = 4653;

    switch (code){
        case 4653:
            System.out.println(sum - (sum/100 * 30));
            break;
        case 5698:
        case 5111:
            System.out.println(sum - (sum/100 * 20));
            break;
        case 6922:
        case 6099:
        case 6113:
            System.out.println(sum - (sum/100 * 10));
            break;
        default:
            System.out.println(sum);
            break;
    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целове число");
        int number = scanner.nextInt();

    while (number !=0){
        if (number%2 == 0){
            number = number+2;
            System.out.println("Чило увеличивается на 2 и равно " + number);
        }else System.out.println("Цислое не увеличивает");
        number = scanner.nextInt();
    }
    System.out.println("Вы вышлииз цикла");

    System.out.println("Снова введите число");
    do {
        number = scanner.nextInt();
        if(number == 0){
            System.out.println("Вы выхоите их цикла");
        }
        else if (number%2 == 0){
            System.out.println("Чило увеличивается на 2 и равно " + number);
        }
        else System.out.println("Цислое не увеличивает");
    }while (number != 0 );


     double name =  Math.random() * 20; //Как задавать диапазон для [0 1 ]
    }
    //Looping циклы
    //инкримент увеличивает значени на едеинцу
    //Постфикс x++(возвращает значение ,потом  увеличивает)
    //Префикс ++x(увеличивает,потом возвращает)
    //дикремент уменьшает значение на еденицу

//    a++ - ++a + ++a - a++  "Состряпать пару тройку раз дома и посчитать"

/* while(условие){
    инструкция в теле цикла
    }
 */
    /*
    do{
    } while(условие)

     */
}
// Двоичный поиск через бинарный поиск
