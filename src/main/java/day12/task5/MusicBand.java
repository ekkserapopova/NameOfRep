package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private ArrayList<MusicArtist> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void addMembers(MusicArtist musicArtist){
        members.add(musicArtist);
    }

    public void removeMembers(MusicArtist musicArtist){
        members.remove(musicArtist);
    }
    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        band2.members.clear();
    }
    public void printMembers(){
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
