package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size;
        int[] arr1 = new int[5];
        int[] arr2 = new  int[5];
        int[] arr3 = new  int[arr1.length + arr2.length];
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử của mảng 1: ");
            size = input.nextInt();
            if (size > 5){
                System.out.print("Vui lòng nhập trong giới hạn 5 phần tử.");
            }
        }while (size > 5);
        for (int i = 0; i < size; i++){
            System.out.print("Nhập vào phần tử của mảng 1 ở vị trí thứ " + (i+1) + " : ");
            arr1[i] = input.nextInt();
        }
        do {
            System.out.print("Nhập số lượng phần tử của mảng 2: ");
            size = input.nextInt();
            if (size > 5){
                System.out.print("Vui lòng nhập trong giới hạn 5 phần tử.");
            }
        }while (size > 5);
        for (int i = 0; i < size; i++){
            System.out.print("Nhập vào phần tử của mảng 2 ở vị trí thứ " + (i+1) + " : ");
            arr2[i] = input.nextInt();
        }
        System.out.print("Các phần tử của mảng 1 vừa nhập vào: " + " ");
        for (int j = 0; j < arr1.length;j++ ){
            System.out.print(arr1[j] + "\t");
        }
        System.out.println("");

        System.out.print("Các phần tử của mảng 2 vừa nhập vào: " + " ");
        for (int j = 0; j < arr1.length;j++ ){
            System.out.print(arr2[j] + "\t");
        }
        for (int k = 0;k < arr1.length;k++){
            arr3[k] = arr1[k];
        }
        for (int k = 0; k < arr2.length;k++ ){
            arr3[arr1.length + k] = arr2[k];
        }
        System.out.println("");

        System.out.print("Các phần tử của mảng 3: ");
        for (int j = 0; j < arr3.length;j++){
            System.out.print(arr3[j] + "\t");
        }


    }
}
