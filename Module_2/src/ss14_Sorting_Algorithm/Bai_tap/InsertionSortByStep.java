package ss14_Sorting_Algorithm.Bai_tap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input Size: ");
        int size = inp.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + arr.length + " values: ");
        for (int i = 0;i < arr.length;i++){
            arr[i] = inp.nextInt();
        }
        System.out.print("Your input list: ");
        for (int list: arr){
            System.out.print(list);
        }
        System.out.println("\n Bắt đầu xử lí sắp xếp---------- ");
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        boolean nextPass = true;
        int x,pos;
        for (int i = 1;i < arr.length && nextPass;i++){
            nextPass = false;
            x = arr[i];
            pos = i;

            while (pos > 0 && x < arr[pos - 1]){
                System.out.println("Swap " + x + " with " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                pos--;
                nextPass = true;
            }
            arr[pos] = x;

            if (nextPass == false){
                System.out.println("Mảng đã được sắp xếp và k cần chuyển tới bước tiếp theo");
                break;
            }

            System.out.print("Danh sách sau " + i + " lần sắp xếp: ");
            for (int j = 0;j < arr.length;j++){
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }

    }
}
