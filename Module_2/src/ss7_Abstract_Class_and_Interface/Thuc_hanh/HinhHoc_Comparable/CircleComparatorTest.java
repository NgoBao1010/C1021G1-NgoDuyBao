package ss7_Abstract_Class_and_Interface.Thuc_hanh.HinhHoc_Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle();
        circle[2] = new Circle(3.5,"red",false);

        System.out.println("Trước khi sort:");
        for (Circle circles: circle){
            System.out.println(circles);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circle,circleComparator);

        System.out.println("Sau khi sort:");
        for (Circle circles: circle){
            System.out.println(circles);
        }
    }
}
