package ss6_Inheritance.Thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(10);
        System.out.println(square);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square = new Square(10,"red",false);
        System.out.println(square);
    }
}
