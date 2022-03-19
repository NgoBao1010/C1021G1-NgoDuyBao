package ss4_Classes_and_Objects_in_Java.Bai_tap;


import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double r1 = (-this.b + Math.sqrt(getDiscriminant()))/2*this.a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-this.b - Math.sqrt(getDiscriminant()))/2*this.a;
        return r2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        double a = input.nextDouble();
        System.out.print("Nhập vào b: ");
        double b = input.nextDouble();
        System.out.print("Nhập vào c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("Phương trình có 2 nghiệm x1 = " + quadraticEquation.getRoot1() + " , x2 = " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() < 0){
            System.out.print("Phương trình vô nghiệm.");
        }else{
            System.out.println("Phương trình có 1 nghiệm duy nhất x = " + quadraticEquation.getRoot1());
        }
    }
}
