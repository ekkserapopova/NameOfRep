package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        double res;
        while (divisor != 0){
            res = 1.0 * dividend / divisor;
            System.out.println(res);
            dividend = scanner.nextInt();
            divisor = scanner.nextInt();
        }

    }
}
