package com.company;

public class Task3 {
    /* #3: Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое
количество дней доставки.*/
    public static void main(String[] args) {

        int deliveryDistance = 59;
        int dayForDelivery = getDayForDelivery(deliveryDistance);
        if(dayForDelivery>0) {
            System.out.println("Потребуется дней: " + getDayForDelivery(deliveryDistance));
        } else {
            System.out.println("К сожалению, это слишком далеко для нашей доставки :(");
        }
    }
    public static int getDayForDelivery(int deliveryDistance) {
        int dayForDelivery = 0;

        if(deliveryDistance < 20) {
            dayForDelivery=1;
        } else if (deliveryDistance < 60) {
            dayForDelivery=2;
        } else if (deliveryDistance < 100) {
            dayForDelivery=3;
        }

        return dayForDelivery;
    }
}
