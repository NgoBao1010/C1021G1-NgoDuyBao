package Thi_Thu.Controller;


import Thi_Thu.Service.Impl.GiangVienServiceImpl;
import Thi_Thu.Service.Impl.HocVienServiceImpl;

import java.util.Scanner;

public class CodeGymController {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static boolean checkChoice;
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        do {
            checkChoice = false;
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Tìm kiếm giảng viên hoặc học sinh");
            System.out.println("6 Thoát");
            System.out.print("Chọn chức năng: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra lại format danh sách !!!");
                checkChoice = true;
                continue;
            }

            switch (choice) {
                case 1:
                    Control.addNew();
                    checkChoice = true;
                    continue;
                case 2:
                    Control.remove();
                    checkChoice = true;
                    continue;
                case 3:
                    Control.display();
                    checkChoice = true;
                    continue;
                case 4:
                    Control.search();
                    checkChoice = true;
                    continue;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        }while (checkChoice);
    }
}
