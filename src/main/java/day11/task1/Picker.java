package day11.task1;

public class Picker implements Worker {
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

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+1);
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже выплачен");
        }else if (warehouse.getCountPickedOrders() == 10000){
            isPayed = true;
            salary += 70000;
        }else {
            System.out.println("Бонус пока не доступен");
        }
    }

}
