package ss11_DSA_Stack_Queue.Bai_tap.B1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NumSwap {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);
        num.push(5);
        List<Integer> newNum = new ArrayList<>();
        while (!num.isEmpty()){
            newNum.add(num.pop());
        }
        System.out.println(newNum);

    }
}
