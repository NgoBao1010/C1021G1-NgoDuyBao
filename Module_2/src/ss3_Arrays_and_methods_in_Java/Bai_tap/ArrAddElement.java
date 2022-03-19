package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class ArrAddElement {
    public static void main(String[] args) {
        int size;
        Scanner inp = new Scanner(System.in);
        int[] num = new int[10];
        do {
            System.out.print("Nhập số lượng phần tử: ");
            size = inp.nextInt();
            if (size >= 10){
                System.out.println("Mảng giới hạn 10 phần tử, vui lòng nhập lại!!!");
            }
        }while (size >= 10);
        for (int i = 0; i < size; i++){
            System.out.print("Nhập phần tử ở vị trí " + (i+1) + " : ");
            num[i] = inp.nextInt();
        }

        System.out.print("Mảng các phần tử vừa nhập vào: " + " ");
        for (int j = 0; j < num.length;j++ ){
            System.out.print(num[j] + "\t");
        }
        System.out.println("");

        System.out.print("Nhập số cần chèn: ");
        int x = inp.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = inp.nextInt();
        if (index < 0 || index > num.length-1){
            System.out.println("Không chèn được phần tử.");
        }else {
            for (int k = num.length-1; k > index;k--){
                num[k] = num[k-1];
            }
            num[index] = x;
       }
        System.out.print("Mảng các phần tử sau khi thêm vào : " + " ");
        for (int j = 0; j < num.length;j++ ){
            System.out.print(num[j] + "\t");
        }
    }
}
