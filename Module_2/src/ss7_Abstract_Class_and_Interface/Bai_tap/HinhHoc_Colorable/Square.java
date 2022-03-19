package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Colorable;

public class Square extends Shape implements Colorable {
    private double side = 2.0;
    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "Square with side= " + this.side + ", Area= " + this.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Square is color all four sides");
    }
}
