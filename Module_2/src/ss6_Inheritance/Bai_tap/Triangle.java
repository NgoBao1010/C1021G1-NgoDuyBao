package ss6_Inheritance.Bai_tap;

import ss6_Inheritance.Thuc_hanh.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double height = 5.0;
    Triangle(){
    }
    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    Triangle(double side1,double side2 , double side3,String color,boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // chiều dài đáy
    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return (side3*height)/2;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle with a= " + side1 +
                ", b= " + side2 + " ,bottom edge c= " + side3 + ", Area is S= " + getArea() +
                " and Perimeters P= " + getPerimeter() + ". " + super.toString();
    }
}
