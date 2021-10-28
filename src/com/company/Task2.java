package com.company;
import java.time.LocalDate;

public class Task2 {
    /* #2: Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
( 0 — iOS или 1 — Android) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).*/

    public static void main(String[] args) {
        byte clientOS = 0; // 0 — iOS, 1 — Android.
        short clientDeviceYear = 2021; // < текущего года - old; = текущему году - new
        System.out.println(getVersionProposal(clientOS,clientDeviceYear));
    }

    public static String getVersionProposal(byte clientOS, short clientDeviceYear) {
        String textForAnswer = "Установите ";
        int currentYear = LocalDate.now().getYear();

        if(clientDeviceYear == currentYear) {
            textForAnswer+="версию ";
        } else {
            textForAnswer+="облегченную версию ";
        }

        if(clientOS==0) {
            textForAnswer+="для iOS ";
        } else {
            textForAnswer+="для Android ";
        }

        textForAnswer+="по ссылке";

        return textForAnswer;
    }
}
