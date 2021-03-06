package ss23_Behavioral_Design_Pattern.Thuc_hanh.Observer;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject sub = new Subject();

        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
