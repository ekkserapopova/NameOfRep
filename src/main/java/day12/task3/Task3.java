package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        for (int i = bands.size() - 1; i >= 0; i--){
            if (bands.get(i).getYear() < 2000){
                bands.remove(i);
            }
        }
        return bands;
    }
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("mb1", 1999);
        MusicBand mb2 = new MusicBand("mb2", 2007);
        MusicBand mb3 = new MusicBand("mb3", 1970);
        MusicBand mb4 = new MusicBand("mb4", 2020);
        MusicBand mb5 = new MusicBand("mb5", 2022);
        MusicBand mb6 = new MusicBand("mb6", 1984);
        MusicBand mb7 = new MusicBand("mb7", 1998);
        MusicBand mb8 = new MusicBand("mb8", 2015);
        MusicBand mb9 = new MusicBand("mb9", 1999);
        MusicBand mb10 = new MusicBand("mb10", 2018);
        ArrayList<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }
}
