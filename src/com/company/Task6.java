package com.company;

public class Task6 {
    /* #6: Снова вспоминаем домашнее задание по массивам. В нем была задача,
которая требовала высчитать среднюю выплату за день.
Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч,
для его генерации допускается использовать метод из прошлого домашнего задания.
- Текст прошлого задания
    Нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
    поделить на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

Нужно сгенерировать массив, подать его в наш метод, а внутри метода подсчитать сумму элементов
и вычислить среднее значение, которое нужно вернуть из метода в виде результата.
Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
То есть для работы этого метода нужно будет создать еще методы (1 или более),
которые его будут обслуживать и вычислять промежуточные результаты. Среднее значение нужно вычислять в дробном виде,
так как результат должен быть точным.*/

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        int lengthArray = getLengthArray(arr);
        int sumForMonth = getSumForMonth(arr,lengthArray);
        float avgForMonth = getAvgForMonth(lengthArray,sumForMonth);

        System.out.println("Сумма трат за месяц составила "+sumForMonth+" рублей");
        System.out.print("Средняя сумма трат ежедневно составила "+avgForMonth+" рублей");
    }

    public static int getLengthArray(int[] arr) {
        return arr.length;
    }

    public static int getSumForMonth(int[] arr, int lengthArray) {
        int sumForMonth = 0;

        for (int i=0; i<lengthArray; i++) {
            sumForMonth+=arr[i];
        }
        return sumForMonth;
    }

    public static float getAvgForMonth(int lengthArray, float sumForMonth) {
        return sumForMonth/lengthArray;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
