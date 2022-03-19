package ss2_Loop_in_Java.Bai_tap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
       int count = 0;
       boolean check;
       int number = 2;
       while (count < 100){
           check = true;
           for (int i = 2; i <= Math.sqrt(number);i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
           }
           if (check){
               if (number < 100){
                   System.out.println(number);
                   count++;
               }
           }
           number++;
       }
    }
}
