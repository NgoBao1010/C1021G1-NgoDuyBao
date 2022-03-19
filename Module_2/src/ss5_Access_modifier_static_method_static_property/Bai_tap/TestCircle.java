package ss5_Access_modifier_static_method_static_property.Bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10.0);
        System.out.println(circle.getArea());
        Circle circle1 = new Circle(20);
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
    }
}
