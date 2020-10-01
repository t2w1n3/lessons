package firstLesson;

public class FirstLesson {
    public static void main(String[] args) {
        System.out.println("Вот строка");
    //обьявление перменной

    byte byteVar;
    //память выделана но инфы в ней нет

        byteVar = 35;

        byteVar = 12; // переопределение

        byte byteVar2,byteVar3;
        byte byteVar4 = 36; byte byteVar5 = 2;

        //short - 2 байта
        short shortType = 2800;

        //int - 4 байта
        int intType = 7664345;
        int intVar = 1_00_00;

        //Long - 8 байт
        long longVAr = 3000000000000000L;

        //float (4 байта)
        float floatVar = 5.7f;
        //При работе с float необзодимо указывать в конце f

        //double (8 байт)
        double doubleVar = 5.80;

        //char (2 байта)
        // хранит данные из таблицы юникода, тип без знаковый
        //от 0 до 65535

        //boolean (true and false)
        boolean booleanVar = true;

        //ПРиведение типов
        byte someByte = 10;

        //автоматическое приведние типво
        int someInt = someByte;

        //явное приведение типов
        someInt = 4000;
        someByte = (byte) someInt;

        //Операторы

        //Операторы присваения
        // = - присвоить значения

        //арифметические
        //+ , - , / , * , %

        int a = 10;
        int b = 20;

        int c = a + b; // 30

       short x = 3;
       short y = 15;

       int res = x + y;
       short z = (short) (x + y);

        System.out.println(c);

        int m = 100;
        double n = 0.2;
        //int zeroDiv = m / 0;

        double zeroDiv2 = n / 0;

        System.out.println(zeroDiv2);

        someByte =3;
        someByte = (byte) (someByte * 7);
        someByte *= 7;

        intType = 10;
        intType = intVar + 20;
        intType += 20;
        c = a/b;

        //Операторы сравнения
        //<, >, <=, >=, !=, == - результат всегда тру или фолс
        System.out.println(6 < 22); // true

        //тернальный оператор ?
        //Возвращает результат в зависимости от условияъ

        int k  = 4;
        int l = 8;

        int result = (k < l) ? k + l : k - l;
        System.out.println(result);

        int first = 6;
        int resultWork = (first % 2 == 0) ? first / 2 : first * 2;
        System.out.println(resultWork);
    }
}
