package ss3_Arrays_and_methods_in_Java.Bai_tap;

import java.util.Scanner;

public class MatrixSquare {
    static int row,col;
    static int[][] matrix;
    public static int Sum(int row,int col){
        int sum = 0;
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col;j++){
                if ( i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Nhập số dòng của ma trận: ");
        row = inp.nextInt();

        do {
            System.out.print("Nhập số cột của ma trận: ");
            col = inp.nextInt();
            if(col < row || col > row){
                System.out.print("Vui lòng nhập số cột bằng số dòng.");
            }
        }while (col < row || col > row);

        matrix = new int[row][col];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col; j++){
                System.out.print("Nhập phần tử ở vị trí " + "(" +  i + ")" + "(" + j + ")" + " : " );
                matrix[i][j] = inp.nextInt();
            }
        }

        for (int k = 0; k < matrix.length; k++){
            System.out.print("Ma trận ở vị trí (" + k + ") ");
            for (int l = 0; l < matrix[k].length;l++){
                System.out.print(matrix[k][l] + "\t");
            }
            System.out.println("");
        }

        int sum = Sum(row,col);
        System.out.println("Tổng của đường chéo chính trong ma trận vuông là: " + sum);
    }
}
