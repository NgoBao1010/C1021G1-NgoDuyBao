package ss6_Inheritance.Bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10,"blue");
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
