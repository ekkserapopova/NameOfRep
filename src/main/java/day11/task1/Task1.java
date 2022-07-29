package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        System.out.println("1 склад");
        Picker picker1 = new Picker(warehouse1);
        businessProcess(picker1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(courier1);
        System.out.println("Собранные заказы: " + warehouse1.getCountPickedOrders());
        System.out.println("Доставленные заказы: " + warehouse1.getCountDeliveredOrders());
        System.out.println("Сборщик: " + picker1.toString());
        System.out.println("Курьер: " + courier1.toString());
        System.out.println();

        Warehouse warehouse2 = new Warehouse();
        System.out.println("2 склад");
        Picker picker2 = new Picker(warehouse2);
        picker2.doWork();
        System.out.print("Сборщик 2 склада: ");
        picker2.bonus();
        Courier courier2 = new Courier(warehouse2);
        courier2.doWork();
        System.out.print("Курьер 2 склада: ");
        courier2.bonus();
        System.out.println("Собранные заказы: " + warehouse2.getCountPickedOrders());
        System.out.println("Доставленные заказы: " + warehouse2.getCountDeliveredOrders());
        System.out.println("Сборщик: " + picker2.toString());
        System.out.println("Курьер: " + courier2.toString());
        System.out.println("1 склад");
        System.out.println("Собранные заказы: " + warehouse1.getCountPickedOrders());
        System.out.println("Доставленные заказы: " + warehouse1.getCountDeliveredOrders());
        System.out.println("Сборщик: " + picker1.toString());
        System.out.println("Курьер: " + courier1.toString());
        System.out.println();

        Warehouse warehouse3 = new Warehouse();
        Picker picker31 = new Picker(warehouse3);
        Picker picker32 = new Picker(warehouse3);
        Courier courier31 = new Courier(warehouse3);
        Courier courier32 = new Courier(warehouse3);
        for (int i = 0; i < 9999; i++){
            picker31.doWork();
            courier31.doWork();
        }
        picker32.doWork();
        courier32.doWork();
        picker31.bonus();
        picker32.bonus();
        courier31.bonus();
        courier32.bonus();
        System.out.println("3 склад");
        System.out.println("Собранные заказы: " + warehouse3.getCountPickedOrders());
        System.out.println("Доставленные заказы: " + warehouse3.getCountDeliveredOrders());
        System.out.println("Сборщик 1: " + picker31.toString());
        System.out.println("Курьер 1: " + courier31.toString());
        System.out.println("Сборщик 2: " + picker32.toString());
        System.out.println("Курьер 2: " + courier32.toString());

    }
}
