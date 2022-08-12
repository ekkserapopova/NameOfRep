package day12;

import java.util.ArrayList;

public class Task2 {
    static void method(int a, int b, ArrayList<Integer> list){
        for (int i = a; i <= b; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        method(0, 30, list);
        System.out.println(list);
        method(300, 350, list);
        System.out.println(list);



    }
}
