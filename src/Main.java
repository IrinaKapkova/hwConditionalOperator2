public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        // Значения для OS 0 — iOS, 1 — Android
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");

        int clientDeviceYear = 2015;
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите приложение для iOS");
            if (clientDeviceYear >= 2015) {
                System.out.println("по ссылке");
            } else {
                System.out.println("облегченную версию по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
    }


    //Високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.
    public static void task3() {
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task4() {
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int numberInterval = (deliveryDistance - 20) / 40;   // Количество дополнительных интервалов
        int d = (deliveryDistance - 20) % 40;    // Остаток от деления
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (d > 0) {
            System.out.println("Доставка займет " + (numberInterval + 2) + " суток");
        } else {
            System.out.println("Доставка займет " + (numberInterval + 1) + " суток");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}