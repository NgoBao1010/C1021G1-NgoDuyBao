package ss1_Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
            case 2:
                daysInMonth = "28 or 29";
                break;
            default:
                daysInMonth = "";
        }
        if(!daysInMonth.equals("")){
            System.out.printf("Tháng %d có %s ngày!",month,daysInMonth);
        }else {
            System.out.print("Không có dữ liệu");
        }
    }

}
