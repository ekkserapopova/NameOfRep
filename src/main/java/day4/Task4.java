package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int max = 0;
        int index = -1;
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*50);
        }
        for (int i = 1; i < 9; i++){
            sum = arr[i - 1] + arr[i] + arr[i + 1];
            if (sum > max){
                max = sum;
                index = i - 1;
            }
        }
        for(int el: arr) {
            System.out.println(el);
        }
        System.out.println(max + " " + index);

    }
}
