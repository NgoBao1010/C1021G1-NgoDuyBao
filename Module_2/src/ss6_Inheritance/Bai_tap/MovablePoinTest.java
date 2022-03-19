package ss6_Inheritance.Bai_tap;

public class MovablePoinTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(10,10);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(5,10,15,20);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
