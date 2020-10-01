package thirdLesson;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        //1.Заполните массив на N элементов случайным целыми числами и выведете максимальное, минимальное и среднее значение

        int[] mass;
        mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }

        int min = mass[0];
        int max = mass[0];
        int mid = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) max = mass[i];
            else if (mass[i] < min) min = mass[i];
            mid += mass[i];
        }
        mid /= 10;

        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимально значение " + min);
        System.out.println("средние арифметическое значение " + mid);

        //Решение задачи  через сортировку
        int[] sortMass = new int[10];
        int sortMin = 0;
        int sortMax = 0;
        int sortMidl = 0;
        for (int i = 0; i < sortMass.length; i++) {
            sortMass[i] = (int) (Math.random() * 500) + 1;
            sortMidl += sortMass[i];
        }

        Arrays.sort(sortMass);

        sortMin = sortMass[0];
        sortMax = sortMass[9];
        sortMidl /= 10;
        Arrays.sort(sortMass);
        System.out.println(Arrays.toString(sortMass));
        System.out.println("Максимальное значение " + sortMax);
        System.out.println("Минимально значение " + sortMin);
        System.out.println("Средние арифметическое значение " + sortMidl);

        //2.Создайте массив из чётных чисел [2;20] и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int[] standardMass = new int[10];
        int[] revertMass = new int[10];
        for (int i = 0, j = 2; i < standardMass.length; i++, j += 2) {
            standardMass[i] = j;
        }

        for (int i = 0, j = 9; i < revertMass.length; i++, j--) {
            revertMass[i] = standardMass[j];
        }

        System.out.println(Arrays.toString(standardMass));
        System.out.println(Arrays.toString(revertMass));

        //3.Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив в консоль.
        // Определите какой элемент встречается в массиве чаще всего и выведите информацию об этом в консоль.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        int minusOne = 0;
        int zero = 0;
        int one = 0;

        int[] randomNumber = new int[11];
        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = (int) (Math.random() * 3) - 1;
            switch (randomNumber[i]) {
                case -1:
                    minusOne++;
                    break;
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
            }
        }
        System.out.println(Arrays.toString(randomNumber));
        if (minusOne > zero && minusOne > one){
            System.out.println("Самое часто встречаемое число -1" );
        }else if (zero > minusOne && zero > one){
            System.out.println("Самое часто встречаемое число 0");
        }else if (one > zero && one > minusOne){
            System.out.println("Самое часто встречаемое число 1");
        }

    }
}
