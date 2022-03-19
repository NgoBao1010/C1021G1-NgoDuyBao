package ss3_Arrays_and_methods_in_Java.Thuc_hanh;

import java.util.Scanner;

public class PassModule {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        array = new int[size];
       for (int i = 0;i < array.length;i++) {
            System.out.print("Nhập điểm cho học sinh thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số học sih thi đậu: " + count);
    }
}
