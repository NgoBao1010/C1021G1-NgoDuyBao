package ss6_Inheritance.Thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        circle = new Circle(10,"blue",false);
        System.out.println(circle);
    }
}
