package ss4_Classes_and_Objects_in_Java.Thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width,height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double Area(){
        return this.height * this.width;
    }
    public double Perimeter(){
        return (this.width + this.height)*2;
    }
    public String display(){
        return "Hình chữ nhật có chiều dài là " + this.height + " và chiều rộng là " + this.width;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double height = input.nextDouble();
        System.out.print("Nhập chiều rộng: " );
        double width = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.Area());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.Perimeter());
    }
}
