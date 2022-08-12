package day12.task4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        MusicBand mB1 = new MusicBand("Pop", 2021);
        mB1.addMembers("Petr Ivanov");
        mB1.addMembers("Ivan Sidorov");
        mB1.addMembers("Alena Potapova");
        mB1.printMembers();
        mB1.removeMembers("Alena Potapova");
        mB1.printMembers();

        MusicBand mB2 = new MusicBand("Pop", 2021);
        mB2.addMembers("Potap Kolop");
        mB2.addMembers("Ipot Koralor");
        mB2.printMembers();

        System.out.println("after");

        MusicBand.transferMembers(mB1, mB2);
        System.out.println(mB1.getMembers());
        System.out.println(mB2.getMembers());


    }
}
