package ss5_Access_modifier_static_method_static_property.Bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area = this.radius + this.radius * 3.14;
        return area;
    }
}
