package Thi_Thu.Service.Impl;

import Thi_Thu.Controller.CodeGymController;
import Thi_Thu.Exception.MyEx;
import Thi_Thu.Model.GiangVien;
import Thi_Thu.Service.IQuanLyService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiangVienServiceImpl implements IQuanLyService {
    public static final String GIANG_VIEN_CSV = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Thi_Thu\\data\\giangVien.csv";
    private List<GiangVien> giangVienList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public GiangVienServiceImpl() {
        giangVienList = read();
    }

    public String[] create(){
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String gender;
        String dayOfBirth;
        boolean check;
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        do {
            check = false;
            System.out.print("Nhập ngày tháng năm sinh theo định dạng (dd/MM/yyyy): ");
            dayOfBirth = scanner.nextLine();

            if (!dayOfBirth.matches(regexDate)) {
                check = true;
                System.out.println("ERROR FORMAT DATE NUMBER: ");
                continue;
            }
            String[] temp = dayOfBirth.split("/");
            if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 12) {
                check = true;
                System.out.println("ERROR FORMAT DATE: ");
                continue;
            }
            if (Integer.parseInt(temp[1]) == 1 || Integer.parseInt(temp[1]) == 3 || Integer.parseInt(temp[1]) == 5 || Integer.parseInt(temp[1]) == 7 ||
                    Integer.parseInt(temp[1]) == 8 || Integer.parseInt(temp[1]) == 10 || Integer.parseInt(temp[1]) == 12) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 31) {
                    check = true;
                    System.out.println("ERROR FORMAT DATE: ");
                    continue;
                }
            } else if (Integer.parseInt(temp[1]) == 2) {
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0) {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 29) {
                        check = true;
                        System.out.println("ERROR FORMAT DATE: ");
                        continue;
                    }
                } else {
                    if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 28) {
                        check = true;
                        System.out.println("ERROR FORMAT DATE: ");
                        continue;
                    }
                }

            } else if (Integer.parseInt(temp[1]) > 0 || Integer.parseInt(temp[1]) < 13) {
                if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 30) {
                    check = true;
                    continue;
                }
            } else {
                check = true;
            }

        } while (check);

        do {
            check = true;
            System.out.print("Nhập giới tính: ");
            gender = scanner.nextLine();
            if (gender.toLowerCase().equals("nam") || gender.toLowerCase().equals("nữ") || gender.toLowerCase().equals("khác")){
                check = false;
                break;
            }
            if (check){
                System.out.println("Vui lòng nhập (nam hoặc nữ hoặc khác)..");
            }
        }while (check);

        String[] arrCreate = {name ,dayOfBirth, gender};
        return arrCreate;
    }
    public static String random(){
        String result = "";
        for (int i = 0; i < 4;i++){
            int code = (int) Math.floor(((Math.random() * 9)));
            result += code;
        }
        return result;
    }
    public void write(){
        File file = new File(GIANG_VIEN_CSV);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (GiangVien giangVien : giangVienList){
                bufferedWriter.write(giangVien.getId() + "," + giangVien.getName()+ "," + giangVien.getDayOfBirth()+ "," + giangVien.getGender() +
                        "," + giangVien.getChuyenMon());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<GiangVien> read(){
        List<GiangVien> giangViens = new ArrayList<>();
        File file = new File(GIANG_VIEN_CSV);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                GiangVien giangVien = new GiangVien(arrData[0],arrData[1],arrData[2],arrData[3],arrData[4]);
                giangViens.add(giangVien);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return giangViens;
    }
    @Override
    public void add() {
        String[] arr = create();
        boolean check;
        System.out.print("Nhập chuyên môn của giảng viên: ");
        String chuyenMon = scanner.nextLine();
        GiangVien giangVien = new GiangVien("GV-" + random(),arr[0],arr[1],arr[2],chuyenMon);
        giangVienList.add(giangVien);
        write();
    }

    @Override
    public void remove() {
        boolean check;
        String inputId = null;
        System.out.println("Vui lòng nhập id giảng viên: ");
        inputId = scanner.nextLine();

        boolean checkEx = true;
        for (int i = 0; i < giangVienList.size(); i++) {
            if (giangVienList.get(i).getId().equals(inputId)) {
                checkEx = false;
                do {
                    check = false;
                    System.out.println("Yes or No");
                    String action = scanner.nextLine();
                    if (!action.toLowerCase().equals("yes") && !action.toLowerCase().equals("no")) {
                        System.out.println("Lỗi nhập sai. Vui lòng nhập lại!");
                        check = true;
                        continue;
                    }else if (action.toLowerCase().equals("yes")) {
                        giangVienList.remove(i);
                        write();
                        break;
                    } else if (action.toLowerCase().equals("no")) {
                        CodeGymController.displayMainMenu();
                    }
                } while (check);
            }
        }
        if (checkEx){
            try {
                throw new MyEx();
            } catch (MyEx e) {
                e.NotFoundSavingException();
            }
        }
    }

    @Override
    public void printAll() {
        for (GiangVien giangVien : giangVienList){
            System.out.println(giangVien);
        }
    }

    @Override
    public void search() {
        String inputName;
        System.out.println("Vui lòng nhập vào tên giảng viên");
        inputName = scanner.nextLine();
        for (int i = 0; i < giangVienList.size(); i++) {
            if (giangVienList.get(i).getName().contains(inputName)) {
                System.out.println(giangVienList.get(i));
            }
        }
    }
}
