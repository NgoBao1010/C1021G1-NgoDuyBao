package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        int size;
        int size2;
        int[][] arr1 = new int[5][5];
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử của ma trận: ");
            size = input.nextInt();
            if (size > 5){
                System.out.print("Vui lòng nhập trong giới hạn 5 phần tử.");
            }
        }while (size > 5);
        for (int i = 0;i < size; i++){
            do {
                System.out.print("Nhập số lượng phần tử con của ma trận ở vị trí " + i + " : ");
                size2 = input.nextInt();
                if (size2 > 5){
                    System.out.print("Vui lòng nhập trong giới hạn 5 phần tử.");
                }
            }while (size2 > 5);
            for (int j = 0; j < size2; j++){
                System.out.print("Nhập phần tử ở vị trí " + "(" +  i + ")" + "(" + j + ")" + " : " );
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.print("Ma trận vừa nhập vào là: " + " ");
        for (int k = 0; k < arr1.length; k++){
            for (int l = 0; l < arr1[k].length;l++){
                System.out.print(arr1[k][l] + "\t");
            }
        }
        System.out.println("");
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length;i++){
            for (int j = 1;j < arr1[i].length;j++){
                if (arr1[i][j] > max){
                    max = arr1[i][j];
                }
            }
        }
        System.out.print("Số lớn nhất trong ma trận là: " + max);
    }
}
