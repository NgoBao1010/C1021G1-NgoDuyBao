package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Colorable;

public class SquareRun {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5,10);
        shapes[1] = new Circle(20);
        shapes[2] = new Square(10);

        System.out.println("Trước khi colorable");
        for (Shape shape: shapes){
            System.out.println(shape);
        }
        System.out.println("");
        System.out.println("Sau khi colorable");
        for (Shape shape: shapes){
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
            System.out.println(shape);
        }
    }
}
