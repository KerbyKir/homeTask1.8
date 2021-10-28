package com.company;

public class Task1 {
    /* #1: Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным,
и выводит результат в консоль. Эту проверку вы уже реализовывали в задании по условным операторам.
Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то должно быть выведено
“номер года —високосный год”. Если год не високосный, то, соответственно: “номер года — невисокосный год”.*/

    public static void main(String[] args) {
        short year = 2021;
        String textForAnswer;
        if(isIntercalaryYear(year)) {
            textForAnswer = "високосный год";
        } else {
            textForAnswer = "невисокосный год";
        }
        System.out.println(year + " - " + textForAnswer);
    }

    public static boolean isIntercalaryYear(short year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
