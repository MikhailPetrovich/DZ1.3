public class Main {
    public static void main(String[] args) {

        // Задача 1

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения IOS по ссылке");
        }

        // Задача 2

        int productionYear = 2015;
        int deviceYear = 2012;
        if (deviceYear < productionYear ) {
            System.out.println("Устоновите облегченную версию приложения для ");
        }else {
            System.out.println("Устоновите версию приложения для ");

        }
        if (clientOS == 1) {
            System.out.println("Андройд по ссялке");
        } else {
            System.out.println("IOS по ссылке");
        }

        // Задача 3

        int year = 2022;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " год являеться высокосным ");

        } else {
            System.out.println(year + " год не являеться высокосным ");
        }

        // Задача 4

        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println(" Потребуеться дней: " + deliveryDays);


        // Задача 5

        int monthNumber = 9;
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
                System.out.println("Такого месяца нет");
        }


        }
}