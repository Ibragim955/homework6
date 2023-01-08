public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
            if (clientOS == 1) {
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }

            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для IOS по ссылке».");
            }
            if (clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }
        }
           //Задача3
        int year = 2021;
        if (year % 4 ==0 && year %  100 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }



    }
}