package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Circle();
        shapes[2] = new Circle(12,"yellow",true);

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
