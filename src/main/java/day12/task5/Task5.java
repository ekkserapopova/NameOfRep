package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand mB1 = new MusicBand("Pop", 2022);
        MusicArtist mA = new MusicArtist("Alena Potapova", 19);
        mB1.addMembers(mA);
        mB1.addMembers(new MusicArtist("Gleb Nolov", 20));
        mB1.addMembers(new MusicArtist("Gleb Polov", 26));
        mB1.addMembers(new MusicArtist("Bob Stone", 23));
        mB1.printMembers();
        mB1.removeMembers(mA);
        mB1.printMembers();

        MusicBand mB2 = new MusicBand("Pop", 2022);
        mB2.addMembers(new MusicArtist("Bob Kanter", 21));
        mB2.addMembers(new MusicArtist("Polos Dod", 24));
        mB2.printMembers();
        MusicBand.transferMembers(mB1, mB2);

        System.out.println("After");
        mB1.printMembers();
        mB2.printMembers();






    }
}
