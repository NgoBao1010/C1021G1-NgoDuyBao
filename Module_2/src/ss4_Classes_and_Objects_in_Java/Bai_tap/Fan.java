package ss4_Classes_and_Objects_in_Java.Bai_tap;

public class Fan {
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private int speed = slow;
    private boolean on;
    private double rad = 5.0;
    private String color = "blue";
    public Fan(int speed,double radius,String color,boolean on){
        this.speed = speed;
        this.rad = radius;
        this.color = color;
        this.on = on;
    }
    public Fan(){}

    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return this.speed;
    }
    void setRad(double radius){
        this.rad = radius;
    }
    double getRad(){
        return this.rad;
    }
    void setOn(boolean on){
        this.on = on;
    }
    boolean getOn(){
        return this.on;
    }
    void setColor(String color){
        this.color = color;
    }
    String getColor (){
        return this.color;
    }

    @Override
    public String toString() {
        if (getOn()) {
            return "Fan is on{" +
                    "speed= " + speed +
                    ", on= " + on +
                    ", rad= " + rad +
                    ", color= '" + color + '\'' +
                    '}';
        } else {
            return "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.print(fan + "\n");
        fan.setOn(true);
        System.out.print(fan);
    }
}
