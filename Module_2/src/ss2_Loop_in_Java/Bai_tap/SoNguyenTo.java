package ss2_Loop_in_Java.Bai_tap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int number = input.nextInt();
        int count = 0;
        int num = 2;
        boolean check;
        if (number <= 20){
            while (count < number){
                check = true;
                for (int i = 2; i <= Math.sqrt(num);i++){
                    if (num % i == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println(num);
                    count++;
                }
                num++;
            }
        }else {
            System.out.print("Quá giới hạn cho phép.");
        }
    }
}
