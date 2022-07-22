package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airpline1 = new Airplane("Man", 2000, 376.0, 1111.0);
        airpline1.setYear(2001);
        airpline1.setLength(377.9);
        airpline1.info();
        airpline1.fillUp(25);
        airpline1.fillUp(50);
        airpline1.info();
    }
}
