package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Resizeable;

public class Square extends Shape {
    private double side = 2.0;
    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side,String color, boolean filled){
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
        return "Hình vuông với cạnh side= " + side + ",là 1 con của lớp " + super.toString() + ",có diện tích Area= " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + this.side* (percent/100);
    }
}
