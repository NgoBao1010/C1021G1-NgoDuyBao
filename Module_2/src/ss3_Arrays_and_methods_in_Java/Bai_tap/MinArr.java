package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class MinArr {
    public static void main(String[] args) {
        int size = 5;
        Scanner inp = new Scanner(System.in);
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++){
            System.out.print("Nhập phần tử ở vị trí " + (i+1) + " : ");
            num[i] = inp.nextInt();
        }
        System.out.print("Mảng các phần tử vừa nhập vào: " + " ");
        for (int j = 0; j < num.length;j++ ){
            System.out.print(num[j] + "\t");
        }
        System.out.println("");

        int min = num[0];
        for (int i = 1;i < num.length;i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.print("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
