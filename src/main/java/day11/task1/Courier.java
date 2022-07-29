package day11.task1;

public class Courier implements Worker{
    private int salary = 0;
    private boolean isPayed = false;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        if (isPayed) {
            return "зарплата - " + salary +
                    ", бонус - выплачен";
        }else{
            return "зарплата - " + salary +
                    ", бонус - не выплачен";
        }
    }
    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders()+1);
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже выплачен");
        }else if (warehouse.getCountDeliveredOrders() == 10000){
            isPayed = true;
            salary += 50000;
        }else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
