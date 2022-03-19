package ss3_Arrays_and_methods_in_Java.Thuc_hanh;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        String[] students = {"Đạt 09", "Lộc lừa", "Ling trọc", "Duy Thựn", "Hồ Quang Hiếu", "Hoàng JAV"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("Không có tên của học sinh " + input_name + " trong danh sách.");
        }
    }
}
