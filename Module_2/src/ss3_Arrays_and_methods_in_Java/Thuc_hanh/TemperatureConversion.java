package ss3_Arrays_and_methods_in_Java.Thuc_hanh;

import java.util.Scanner;

public class TemperatureConversion {
    public static double fromCtoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fromFtoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Đổi từ độ F sang độ C");
            System.out.println("2.Đổi từ độ C sang độ F");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn là: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập độ F: ");
                    doF = input.nextDouble();
                    System.out.print("Độ C là: " + fromFtoC(doF));
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Nhập độ C: ");
                    doC = input.nextDouble();
                    System.out.print("Độ F là: " + fromCtoF(doC));
                    System.out.println("");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
