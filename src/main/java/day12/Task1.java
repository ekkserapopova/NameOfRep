package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Skoda");
        list.add("Audi");
        list.add("Toyota");
        list.add("Honda");
        System.out.println(list.toString());
        list.add(3, "Jeep");
        list.remove(0);
        System.out.println(list);

    }
}
