package ss1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
