//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void calculationCurrentYear(int year){
       if (year > 1585){
           if ((year % 400 ==0 && year % 100 !=0) || (year % 4 == 0 )){
               System.out.println(year + " год является високосным");
           }else {
               System.out.println(year + " год не является високосным");
           }
        }

    }
    public static void installingOsAndYear(int clientOS, int clientDeviceYear){
        if (clientOS == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear <=2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(clientOS ==0){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }
    public static void calculateDeliveryDays(int deliveryDistance) {
        int days = 1;
        if(deliveryDistance >20 && deliveryDistance <=60){
            days = days +1;

        }else if (deliveryDistance >60 && deliveryDistance <=100){
            days = days+2;

        }else if(deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println("Потребуется дней: " + days);
    }

    public static void main(String[] args) {
        System.out.println("task 1");
        calculationCurrentYear(2021);
        System.out.println("task2 ");
        installingOsAndYear(0, 2014);
        System.out.println("task 3");
        calculateDeliveryDays(95);
    }
}