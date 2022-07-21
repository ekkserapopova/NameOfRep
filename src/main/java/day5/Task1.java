package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setColor("black");
        car1.setYearOfIssue(2022);
        System.out.println("Model: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year of issue: " + car1.getYearOfIssue());
    }
}

