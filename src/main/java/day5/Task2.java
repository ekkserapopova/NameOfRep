package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("model", "black", 2021);
        System.out.println("Model: " + motorbike1.getModel());
        System.out.println("Color: " + motorbike1.getColor());
        System.out.println("Year of issue: " + motorbike1.getYearOfManufacture());
    }
}
