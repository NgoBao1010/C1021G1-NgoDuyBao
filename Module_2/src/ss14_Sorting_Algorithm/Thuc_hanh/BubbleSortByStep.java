package ss14_Sorting_Algorithm.Thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int k = 1;k < list.length && needNextPass;k++){
            needNextPass = false;
            for (int i = 0;i < list.length - k;i++){
                if (list[i] > list[i + 1]){
                    System.out.println("Swap" + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }

            }
            if (needNextPass == false){
                System.out.println("Mảng đã được sắp xếp và k cần chuyển tới bước tiếp theo");
                break;
            }
            System.out.print("Danh sách sau " + k + " lần sắp xếp: ");
            for (int j = 0;j < list.length;j++){
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + arr.length + " values: ");
        for (int i = 0;i < arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int list: arr){
            System.out.print(list);
        }
        System.out.println("\n Bắt đầu xử lí sắp xếp---------- ");
        bubbleSortByStep(arr);
    }
}
