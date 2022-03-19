package ss3_Arrays_and_methods_in_Java.Thuc_hanh;

import java.util.Scanner;

public class CheckMax {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử ( từ 1 - 20 ): ");
        int number = input.nextInt();
        if (number <= 20){
            array = new int[number];
            for (int i = 0; i < number;i++){
                System.out.print("Nhập tài sản của người thứ " + (i+1)+" (đơn vị: tỷ USD) : ");
                array[i] = input.nextInt();
            }
            System.out.print("Danh sách tài sản: " + " ");
            for (int i = 0; i < array.length;i++){
                System.out.print(array[i] + "\t");
            }
            System.out.println("");
            int max = array[0];
            for (int j = 1; j < array.length;j++){
                if (array[j] > max){
                    max = array[j];
                }
            }
            System.out.print("Giá trị tài sản lớn nhất trong danh sách là: " + max + " tỷ USD");
        }
    }
}
