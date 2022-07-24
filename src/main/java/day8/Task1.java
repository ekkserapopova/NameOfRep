package day8;

public class Task1 {
    public static void main(String[] args) {
         //String str = "";
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i <= 20000; i++){
             //str += Integer.toString(i);
             sb.append(Integer.toString(i));
             if (i != 20000){
                 //str += " ";
                 sb.append(" ");
             }
         }
        //System.out.println(str);
        System.out.println(sb);

    }
}
