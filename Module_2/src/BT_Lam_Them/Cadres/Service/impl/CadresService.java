package BT_Lam_Them.Cadres.Service.impl;

import BT_Lam_Them.Cadres.Model.Cadres;
import BT_Lam_Them.Cadres.Service.ICadresService;


import java.util.Arrays;
import java.util.Scanner;

public class CadresService implements ICadresService {
    private Cadres[] cadresList = new Cadres[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;
    private double coefficSalary;
    private double allowance;
    @Override
    public void addList() {
        if (count < cadresList.length){
            System.out.print("Nhập mã số cán bộ: ");
            String code = scanner.nextLine();
            System.out.print("Nhập họ và tên cán bộ: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giới tính cán bộ: ");
            String sex = scanner.nextLine();
            System.out.print("Nhập quê quán cán bộ: ");
            String homeTown = scanner.nextLine();
            System.out.print("Nhập ngày tháng năm sinh cán bộ: ");
            String dayOfBirth = scanner.nextLine();
            System.out.print("Nhập chuyên môn cán bộ: ");
            String tech = scanner.nextLine();
            System.out.print("Nhập trình độ cán bộ: ");
            String level = scanner.nextLine();
            System.out.print("Nhập hệ số lương cán bộ: ");
            coefficSalary = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập phụ cấp cán bộ: ");
            allowance = Double.parseDouble(scanner.nextLine());

            Cadres cadres = new Cadres(code,name,sex,homeTown,dayOfBirth,tech,level,coefficSalary,allowance);
            cadresList[count] = cadres;
            count++;
        }else {
            System.out.println("Danh sách đã đầy. Không thể thêm mới.");
        }
    }



    @Override
    public void countFemale() {
        int count1 = 0;
        for (int i = 0; i < cadresList.length;i++){
            if (cadresList[i] == null){
                break;
            }
            if (cadresList[i].getSex().equals("Female")){
                count1 += 1;
            }
        }
        System.out.println("Số cán bộ nữ trong công ty là: " + count1);
    }

    @Override
    public void totalSalary() {
       double sum = (coefficSalary + allowance)*450000;
       for (int i = 0;i < cadresList.length;i++){
           if (cadresList[i]==null){
               break;
           }
           System.out.println(cadresList[i] + ", total salary= " + sum);
       }
    }

    @Override
    public void itList() {
        for (int i = 0;i < cadresList.length;i++){
            if(cadresList[i] == null){
                break;
            }
            if (cadresList[i].getTech().equals("Công nghệ thông tin")){
                System.out.println(cadresList[i]);
            }
        }
    }

    @Override
    public void print() {
        for (Cadres cadres: cadresList){
            if (cadres == null){
                break;
            }
            System.out.println(cadres);
        }
    }
}
