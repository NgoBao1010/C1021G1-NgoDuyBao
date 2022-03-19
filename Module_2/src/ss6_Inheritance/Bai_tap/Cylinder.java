package ss6_Inheritance.Bai_tap;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){}

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*super.getRadius()*super.getRadius()*height;
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao là height= " + height + " màu = " + super.getColor() + ",và thể tích là: " + this.getVolume();
    }
}
