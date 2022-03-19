package Thi_Thu.Controller;

import Thi_Thu.Service.Impl.GiangVienServiceImpl;
import Thi_Thu.Service.Impl.HocVienServiceImpl;

import java.util.Scanner;

public class Control {
    static boolean checkChoice;
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    public static void search() {
        do {
            checkChoice = false;
            System.out.println("1. Tìm kiếm học viên");
            System.out.println("2. Tìm kiếm giảng viên");
            System.out.println("3. Quay lại thanh menu");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn !!!");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra lại format danh sách !!!");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    HocVienServiceImpl hocVien = new HocVienServiceImpl();
                    hocVien.search();
                    checkChoice = true;
                    continue;
                case 2:
                    GiangVienServiceImpl giangVien = new GiangVienServiceImpl();
                    giangVien.search();
                    checkChoice = true;
                    continue;
                case 3:
                    CodeGymController.displayMainMenu();
                    break;

                default:
                    System.out.println("Vui lòng kiểm tra lại danh sách !!!");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void display() {
        do {
            checkChoice = false;
            System.out.println("1. Xem học viên");
            System.out.println("2. Xem giảng viên");
            System.out.println("3. Quay lại thanh menu");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn !!!");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra lại format danh sách !!!");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    HocVienServiceImpl hocVien = new HocVienServiceImpl();
                    hocVien.printAll();
                    checkChoice = true;
                    continue;
                case 2:
                    GiangVienServiceImpl giangVien = new GiangVienServiceImpl();
                    giangVien.printAll();
                    checkChoice = true;
                    continue;
                case 3:
                    CodeGymController.displayMainMenu();
                    break;

                default:
                    System.out.println("Vui lòng kiểm tra lại danh sách !!!");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void remove() {
        do {
            checkChoice = false;
            System.out.println("1. Xóa học viên");
            System.out.println("2. Xóa giảng viên");
            System.out.println("3. Quay lại thanh menu");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn !!!");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra lại format danh sách !!!");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    HocVienServiceImpl hocVien = new HocVienServiceImpl();
                    hocVien.remove();
                    checkChoice = true;
                    continue;
                case 2:
                    GiangVienServiceImpl giangVien = new GiangVienServiceImpl();
                    giangVien.remove();
                    checkChoice = true;
                    continue;
                case 3:
                    CodeGymController.displayMainMenu();
                    break;

                default:
                    System.out.println("Vui lòng kiểm tra lại danh sách !!!");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void addNew() {
        do {
            checkChoice = false;
            System.out.println("1. Thêm mới học viên");
            System.out.println("2. Thêm mới giảng viên");
            System.out.println("3. Quay lại thanh menu");
            System.out.println("Vui lòng nhập sự lựa chọn của bạn !!!");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng kiểm tra lại format danh sách !!!");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    HocVienServiceImpl hocVien = new HocVienServiceImpl();
                    hocVien.add();
                    checkChoice = true;
                    continue;
                case 2:
                    GiangVienServiceImpl giangVien = new GiangVienServiceImpl();
                    giangVien.add();
                    checkChoice = true;
                    continue;
                case 3:
                    CodeGymController.displayMainMenu();
                    break;

                default:
                    System.out.println("Vui lòng kiểm tra lại danh sách !!!");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }
}
