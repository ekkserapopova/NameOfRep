package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        Player.info();
        System.out.println("Kоличество игроков на поле: " + Player.countPlayers);
        Player player7 = new Player(random.nextInt(11) + 90);
        System.out.println("Kоличество игроков на поле(после попытки добавления 7 игрока): " + Player.countPlayers);
        int stamina2  = player2.getStamina();
        for (int i = 0; i < stamina2; i++){
            player2.run();
        }
        System.out.println("Выносливость 2 игрока: " + player2.getStamina());
        player2.run();
        System.out.println("Выносливость 2 игрока: " + player2.getStamina());//не уходит в минус
        Player.info();

    }
}
