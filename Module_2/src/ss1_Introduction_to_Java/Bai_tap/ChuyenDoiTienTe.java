package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23450;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số USD muốn quy đổi: ");
        double usd = scanner.nextInt();
        double translate = usd * rate;
        System.out.print("Số tiền VND sau khi quy đổi: " + translate);
    }
}
