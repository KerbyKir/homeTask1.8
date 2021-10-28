package com.company;

import java.util.Arrays;

public class Task5 {
    /* #5: Напишите метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
Подобное задание вы решали в домашнем задании по массивам.
В метод приходит массив, допустим:
{3, 2, 1, 6, 5}.
Нужно без вспомогательного массива переместить элементы так, чтобы поданный массив стал: {5, 6, 1, 2, 3}.
Рекомендуем написать этот метод без возвращаемого значения.
Вы будете приятно удивлены, что даже если мы не вернем массив, первоначальный массив изменится,
когда мы будем модернизировать пришедший в виде параметра массив внутри метода.

Причину такого поведения ссылочных типов (объектов) вы узнаете на следующем уроке или на QA-вебинаре.*/
    public static void main(String[] args) {

        int [] arr = {3, 2, 1, 6, 5};
        getReverseArray(arr);
        //System.out.println(Arrays.toString(arr));
    }

    public static void getReverseArray(int[] arr) {
        int addValue;

        for (int i = 0; i < (arr.length/2); i++) {
            addValue=arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = arr[i];
            arr[i]=addValue;
        }
        //System.out.println(Arrays.toString(arr));
    }
}
