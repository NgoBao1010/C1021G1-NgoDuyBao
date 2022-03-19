package ss7_Abstract_Class_and_Interface.Thuc_hanh.HinhHoc_Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle(2.0);
        comparableCircle[1] = new ComparableCircle();
        comparableCircle[2] = new ComparableCircle(2.0,"Blue",false);

        System.out.println("Trước khi nối: ");
        for (ComparableCircle circle: comparableCircle){
            System.out.println(circle);
        }
        Arrays.sort(comparableCircle);
        System.out.println("Sau khi nối: ");
        for (ComparableCircle circle : comparableCircle){
            System.out.println(circle);
        }
    }
}
