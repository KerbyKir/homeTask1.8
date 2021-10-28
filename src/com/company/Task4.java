package com.company;

public class Task4 {
    /* #4: Вернемся к задаче о валидаторе текста из урока по строкам.
Напишите метод, который в виде параметра принимает отсортированную строку.
Например, aabccddefgghiijjkk.
С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль сообщение об этом.
Если дубль найден, нужно прервать поиск по остальным символам и вывести сообщение о присутствии дубля,
причем с указанием, какой именно символ задублирован. Затем сразу же прервать выполнение метода.
Сам метод ничего возвращать не должен (void).*/
    public static void main(String[] args) {

        String string = "aabccddefgghiijjkk";
        findRepeat(string);
    }

    public static void findRepeat(String string) {
        StringBuilder stringResult= new StringBuilder();

        for(int i=1;i<string.length();i++){
            boolean isRepeat=stringResult.toString().indexOf(string.charAt(i))!=-1;

            if(string.charAt(i)==string.charAt(i-1) || isRepeat){
                System.out.print("Задублирован символ: "+ string.charAt(i));
                break;
            } else if (i==string.length()-1) {
                System.out.print("Дублей не найдено");
            } else {
                stringResult.append(string.charAt(i));
            }
        }
    }
}
