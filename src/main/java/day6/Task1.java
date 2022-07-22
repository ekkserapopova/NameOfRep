package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2020);
        car1.info();
        System.out.println(car1.yearDifference(2011));
        Motorbike motorbike1 = new Motorbike("model", "black", 2008);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2007));
    }
}
