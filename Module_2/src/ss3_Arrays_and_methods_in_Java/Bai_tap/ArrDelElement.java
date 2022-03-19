package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class ArrDelElement {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số cần xóa: ");
        int x = sc.nextInt();
        int index_del = 0;
        for (int i = 0; i < num.length;i++){
            if (x == num[i]){
                index_del = i;
                System.out.print("Vị trí cần xóa là: " + index_del);
            }
        }
        for (int j = index_del;j < num.length-1;j++){
            num[j] = num[j+1];
        }
        System.out.println("");
        System.out.print("Mảng sau khi xóa phần tử x: " + " ");
        for (int j = 0;j < num.length-1; j++){
            System.out.print(num[j] + "\t");
        }
    }
}
