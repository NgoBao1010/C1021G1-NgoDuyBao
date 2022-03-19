package ss2_Loop_in_Java.Thuc_hanh;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double tienGoi = 1.0;
        int soThangGoi = 1;
        double laiSuat = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gởi: ");
        tienGoi = sc.nextDouble();
        System.out.print("Nhập số tháng gởi: ");
        soThangGoi = sc.nextInt();
        System.out.print("Nhập tỉ lệ lãi suất: ");
        laiSuat = sc.nextDouble();

        double soTienLai = tienGoi * (laiSuat/100)/12 * soThangGoi;
        System.out.print("Số tiền lãi là: " + soTienLai);
    }
}
