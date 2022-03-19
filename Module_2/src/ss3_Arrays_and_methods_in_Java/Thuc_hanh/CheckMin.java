package ss3_Arrays_and_methods_in_Java.Thuc_hanh;

public class CheckMin {
    public static int minCheck(int[] array){
        int min = array[0];
        for (int i = 1 ; i < array.length; i++){
            if (array[i] < array[0]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4,12,7,8,1,6,9};
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minCheck(arr));
    }
}
