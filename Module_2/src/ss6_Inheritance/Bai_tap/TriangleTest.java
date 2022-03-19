package ss6_Inheritance.Bai_tap;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle.setColor("red");
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(10,20,30);
        System.out.println(triangle1);
        triangle1.setFilled(false);
        System.out.println(triangle1);
    }
}
