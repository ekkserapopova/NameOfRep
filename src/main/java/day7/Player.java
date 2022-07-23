package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    public void run(){
        if (stamina == 1){
            stamina--;
            countPlayers--;
        }else if (stamina != 0){
            stamina--;
        }
    }
    public static void info(){
        if (countPlayers < 6){
            System.out.println("Комады неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6){
            countPlayers++;
        }
    }
}
