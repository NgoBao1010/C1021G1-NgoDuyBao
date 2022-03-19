package ss14_Sorting_Algorithm.Bai_tap;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int x,position;
        for (int i = 1;i < arr.length ;i++){
            x = arr[i];
            position = i;
            while (position > 0 && x < arr[position - 1]){
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = x;
        }
        for (int j = 0;j < arr.length;j++){
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,10,5,22,15,23,99};
        System.out.print("Trước khi sort: ");
        for (int arrs : arr){
            System.out.print(arrs + "\t");
        }
        System.out.println();
        System.out.print("Sau khi sort: ");
        insertionSort(arr);
    }

}
