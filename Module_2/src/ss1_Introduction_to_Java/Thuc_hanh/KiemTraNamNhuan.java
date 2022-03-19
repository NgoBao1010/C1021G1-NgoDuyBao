package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int years = scanner.nextInt();
        boolean check;
        if (years % 100 == 0){
            if (years % 400 == 0){
                check = true;
            }else {
                check = false;
            }
        }else if (years % 4 == 0){
            check = true;
        }else {
            check = false;
        }
        if (check){
            System.out.printf("%d là năm nhuận.",years);
        }else {
            System.out.printf("%d không phải là năm nhuận.", years);
        }
    }
}
