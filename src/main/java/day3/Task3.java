package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;
        for (int i = 0; i < 5; i++){
            dividend = scanner.nextInt();
            divisor = scanner.nextInt();
            if (divisor == 0){
                System.out.println("Деление на 0");
            }else{
                System.out.println(1.0 * dividend / divisor);
            }
        }

    }
}
