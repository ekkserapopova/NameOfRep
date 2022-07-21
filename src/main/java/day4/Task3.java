package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] matr = new int[12][8];
        int max = 0;
        int sum = 0;
        byte num = -1;
        for (int i = 0; i < 12; i++){
            sum = 0;
            for (int j = 0; j < 8; j++){
                matr[i][j] = (int)(Math.random() * 50);
                sum += matr[i][j];
            }
            if (sum > max){
                max = sum;
                num = (byte)i;
            }
        }
//        for (int i = 0; i < 12; i++){
//            for (int j = 0; j < 8; j++){
//                System.out.print(matr[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(num);

    }
}
