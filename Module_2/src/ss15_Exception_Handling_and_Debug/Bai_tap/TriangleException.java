package ss15_Exception_Handling_and_Debug.Bai_tap;

import java.util.Scanner;

public class TriangleException {
    public void triangleCheck(int a, int b,int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException(2);
        }
        if (a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalTriangleException(1);
        }
        System.out.println("Tam giác có cạnh a = " + a + " ,b = " + b + " ,c = " + c);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        TriangleException check = new TriangleException();
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            try {
                System.out.print("Nhập vào cạnh a: ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("Nhập vào cạnh b: ");
                b = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Nhập vào cạnh c: ");
                c = Integer.parseInt(scanner.nextLine());

                try {
                    check.triangleCheck(a,b,c);
                    break;
                }catch (IllegalTriangleException illegalTriangleException){
                    if (illegalTriangleException.getA() == 1){
                        System.out.println(illegalTriangleException.getMessage());
                    }else{
                        System.out.println(illegalTriangleException.getMessage2());
                    }

                }
            }catch (NumberFormatException num) {
                System.out.println("NumberFormatException : Vui lòng nhập số.!!!");
            }catch (Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }while (true);

    }
}
