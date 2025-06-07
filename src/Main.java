//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void isYearLeap(int year) {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
    public static String calculatingDeliveryDays(int deliveryDistance) {
        int timeOneZoneDelivery = 1;
        String result;
        if (deliveryDistance > 100) {
            result = "Доставки нет";
        } else if (deliveryDistance > 60) {
            timeOneZoneDelivery += 2;
            result = "Потребуется дней доставки: " + timeOneZoneDelivery;
        } else if (deliveryDistance > 20) {
            timeOneZoneDelivery += 1;
            result = "Потребуется дней доставки: " + timeOneZoneDelivery;
        } else {
            result = "Потребуется дней доставки: " + timeOneZoneDelivery;
        }
        return result;
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


    public static void main(String[] args) {
        System.out.println("task 1");
        isYearLeap(2021);
        System.out.println("task2 ");
        installingOsAndYear(0, 2014);
        System.out.println("task 3");
        System.out.println(calculatingDeliveryDays(50));
    }
}