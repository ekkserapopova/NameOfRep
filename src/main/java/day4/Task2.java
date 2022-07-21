package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i] = (int)(Math.random()*1000);
        }
        int min = array[0];
        int max = array[0];
        byte count0 = 0;
        int sum0 = 0;
        for(int arr: array){
            if (arr > max){
                max = arr;
            } else if (arr < min){
                min = arr;
            }
            if (arr % 10 == 0){
                count0++;
                sum0 += arr;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max + "\nCount ...0: " + count0 + "\nSum ...0: " + sum0);

    }
}
