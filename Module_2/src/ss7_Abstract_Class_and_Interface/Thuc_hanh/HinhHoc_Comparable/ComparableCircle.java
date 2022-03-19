package ss7_Abstract_Class_and_Interface.Thuc_hanh.HinhHoc_Comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public String color = "red";
    public boolean filled = false;

    public ComparableCircle(){}
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius);
        this.color = color;
        this.filled = filled;
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
