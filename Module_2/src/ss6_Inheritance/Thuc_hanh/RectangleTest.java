package ss6_Inheritance.Thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec);

        rec = new Rectangle(10,20);
        System.out.println(rec);

        rec = new Rectangle(10,20,"black",false);
        System.out.println(rec);

        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    }
}
