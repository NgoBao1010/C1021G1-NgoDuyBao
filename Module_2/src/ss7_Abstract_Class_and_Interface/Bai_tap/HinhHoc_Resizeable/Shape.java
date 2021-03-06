package ss7_Abstract_Class_and_Interface.Bai_tap.HinhHoc_Resizeable;

public abstract class Shape implements Resizeable{
    private String color = "Red";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " Shape có màu "
                + getColor()
                + " và "
                + (isFilled() ? "được tô" : "không được tô");
    }
}
