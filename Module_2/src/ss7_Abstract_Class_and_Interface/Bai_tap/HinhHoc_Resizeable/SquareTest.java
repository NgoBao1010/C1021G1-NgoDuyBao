package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5);
        shapes[1] = new Square();
        shapes[2] = new Square(5,"Black",true);

        System.out.println("Trước khi resize");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        System.out.println("Sau khi resize");
        for (Shape shape: shapes){
            shape.resize(Math.random()*100);
            System.out.println(shape);
        }
    }
}
