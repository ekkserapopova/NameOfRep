package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<String> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void addMembers(String name){
        members.add(name);
    }

    public void removeMembers(String name){
        members.remove(name);
    }
    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        band2.members.clear();
    }
    public void printMembers(){
        System.out.println(members);
    }


    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
