package ss6_Inheritance.Bai_tap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5,"Blue",10);
        System.out.println(cylinder);
    }
}
