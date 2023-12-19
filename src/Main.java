public class Main {
    public static void main(String[] args) {

     System.out.println("Задача 1");
     byte clientOS = 0;
     if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
     }else if (clientOS == 1){
        System.out.println("Установите версию приложения для Android по ссылке.");
     } else {
        System.out.println("Нет доступной установки на ОС вашего мобильного устройства.");
        }

     System.out.println("Задача 2");
     clientOS = 0;
     int clientDeviceYear = 2019;
     int limitYears = 2015;
     if (clientOS == 0 && clientDeviceYear > limitYears) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
     } else if (clientOS == 1 && clientDeviceYear > limitYears){
        System.out.println("Установите версию приложения для Android по ссылке.");
     } else if (clientOS == 0 && clientDeviceYear <= limitYears) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
     } else {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

     System.out.println("Задача 3");
     int year = 2023;
     if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println( + year + " год является високосным.");
     }else {
        System.out.println( + year + " год не является високосным.");
        }

     System.out.println("Задача 4");
     int deliveryDistance = 95;
     if (deliveryDistance < 20){
        System.out.println("Потребуется дней: 1.");
     } else if (deliveryDistance < 65) {
        System.out.println("Потребуется дней: 2.");
     } else if (deliveryDistance < 100) {
        System.out.println("Потребуется дней: 3.");
     }else {
        System.out.println("Доставка не осуществляется.");
        }

     System.out.println("Задача 5");
     int monthNumber = 34;
     switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(+monthNumber + "-й месяц года принадлежит зимнему сезону.");
                break;
            case 3, 4, 5:
                System.out.println(+monthNumber + "-й месяц года принадлежит весеннему сезону.");
                break;
            case 6, 7, 8:
                System.out.println(+monthNumber + "-й месяц года принадлежит летнему сезону.");
                break;
            case 9, 10, 11:
                System.out.println(+monthNumber + "-й месяц года принадлежит осеннему сезону.");
                break;
            default:
                System.out.println("Такого месяца не существует.");


        }





    }
}