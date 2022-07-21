package day4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int moreEight= 0;
        int countOfOne = 0;
        int even = 0;
        //int uneven = 0;
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 10);
            if (arr[i]> 8){
                moreEight++;
            }
            if (arr[i] == 1){
                countOfOne++;
            }
            if (arr[i] % 2 == 0){
                even++;
            }
//            else {
//                uneven++;
//            }
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длинна массива: " + n);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1:  " + countOfOne);
        System.out.println("Количество четных чисел:  " + even);
        System.out.println("Количество нечетных чисел:  " + (n - even));
        System.out.println("Сумма всех элементов массива:  " + sum);

    }
}
