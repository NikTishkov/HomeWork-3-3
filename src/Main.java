public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println("Task 2");
        //Task 2
        int clientDeviceYear = 2014;
        int clientOS1 = 1;
        if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Task 3");
        //Task 3
        int age = 2021;
        if (age <= 1584) {
            System.out.println("Год меньше того, в котором был введен високосный.");
        } else {
            if ((age % 400 == 0) || (age % 100 != 0 && age % 4 == 0)) {
                System.out.println("Год високосный.");
            } else {
                System.out.println("Год не високосный.");
            }
        }
        System.out.println("Task 4");
        //Task 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3.");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        System.out.println("Task 5");
        //Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Сейчас зима.");
                break;
            case 3, 4, 5:
                System.out.println("Сейчас весна.");
                break;
            case 6, 7, 8:
                System.out.println("Сейчас лето.");
                break;
            case 9, 10, 11:
                System.out.println("Сейчас осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}