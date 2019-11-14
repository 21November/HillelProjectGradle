package lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        //Задание 1
        //Фрагмент определение max для 2х чисел.
        int number1 = 12;
        int number2 = 15;

        if(number1 > number2){
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number2 + " > " + number1);
        }

        //Задание 2
        //Определить век по заданному году. Например, 2019 - 21 век, но 2000 - 20 век.

        int year1 = 2019;
        int century = year1 / 100;
        System.out.println(year1 + " год = " + century + " веку.");

        //Задание 3
        //Определить високосный ли заданный год.

        int year = 2399;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " высокосный год");
            }else {
                System.out.println(year + " невысокосный год");
            }
        } else {
            System.out.println(year + " невысокосный год");
        }

        //Задание 4
        //Заполнить одномерный целочисленный массив значениями от 1 до 10 включительно.

        int[] array = new int[10];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        //Задание 5
        //Реализовать функцию вывода линейного массива чисел с плавающей запятой с ограничением
        // до 2х знаков после запятой. Обработать ситуацию с пустым массивом.
        // Пример вывода: [3,14; 2.72; 6.72; -2.34; 1.2; 1235]

        double[] array2 = {3.14, 2.72, 6.72, -2.34, 1.2, 1235.0};

        if (array2.length == 0){
            System.out.println(Arrays.toString(array2));
        }

        for(double value : array2)
        {
            System.out.printf("%.2f", value);
            System.out.println();
        }
        System.out.println();

        //Задание 6
        //Посчитать сумму цифр числа. Например, в числе 123 сумма цифр - 6.

        int number = 257;
        int number3 = 0;
        int sum = 0;
        if (number != 0){
            number3 = number;
            while ( number3 != 0) {
                sum += (number3 % 10);
                number3 /= 10;
            }
            System.out.println("Сумма цыфр числа " + number + " = " +sum);
        } else {
            System.out.println("Сумма цыфр числа " + number + " = " +sum);
        }



    }
}
