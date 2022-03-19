package ss2_Loop_in_Java.Thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(number + " không phải số nguyên tố.");
        }else {
            int count = 0;
            for (int i = 1; i <= number; i++){
                if (number % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
