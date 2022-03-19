package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class MatrixColSum {
    static int row,col;
    static double[][] matrix;
    static int index;
    static Scanner inp = new Scanner(System.in);
    public static double ColSum(int row, int col){
        double sum = 0;
        for (int i = 0;i < row;i++){
            sum += matrix[i][index];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Nhập số dòng của ma trận: ");
        row = inp.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        col = inp.nextInt();
        matrix = new double[row][col];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("Nhập phần tử ở vị trí " + "(" +  i + ")" + "(" + j + ")" + " : " );
                matrix[i][j] = inp.nextDouble();
            }
        }
        for (int k = 0; k < matrix.length; k++){
            System.out.print("Ma trận ở vị trí (" + k + ") " + " ");
            for (int l = 0; l < matrix[k].length;l++){
                System.out.print(matrix[k][l] + "\t");
            }
            System.out.println("");
        }

        System.out.print("Nhập cột muốn tính tổng: ");
        index = inp.nextInt();
        double newSum = ColSum(row,col);
        System.out.print("Tổng của cột " + index + " là: " + newSum);
    }
}
