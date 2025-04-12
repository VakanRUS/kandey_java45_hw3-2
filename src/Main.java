public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        byte clientOS = 1; //(0 — iOS, 1 — Android)
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Неизвестный тип операционной системы");
        }
        System.out.println();

        //task 2
        System.out.println("task 2");
        short clientDeviceYear = 2011; // до 2015 года - лблегчённая версия, 2015 и выше - обычная
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else System.out.println("Неизвестный тип операционной системы");
        System.out.println();

        //task 3
        System.out.println("task 3");
        int year = 2021;
        if (year > 1584 && ((year % 100 > 0 && year % 4 == 0) || year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else if (year < 1584) {
            System.out.println("Тогда не было понятия високосных годов");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println();

        //task 4
        System.out.println("task 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Дставки нет");
        }
        System.out.println();

        // task 5
        System.out.println("task 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца в году");
        }
        System.out.println();
    }
}