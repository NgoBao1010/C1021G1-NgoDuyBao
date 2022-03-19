package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Nhập chiều cao(tính theo m): ");
        height = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        weight = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("Chỉ số BMI của bạn là: " + bmi );

        if (bmi < 18){
            System.out.print("Quá gầy.");
        }else if (bmi < 25.0){
            System.out.print("Bình thường.");
        }else if (bmi < 30.0){
            System.out.print("Mập.");
        }else {
            System.out.print("Béo phì.");
        }
    }
}
