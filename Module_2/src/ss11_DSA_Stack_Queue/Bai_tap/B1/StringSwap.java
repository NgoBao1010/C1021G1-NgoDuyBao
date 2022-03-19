package ss11_DSA_Stack_Queue.Bai_tap.B1;

import java.util.Stack;

public class StringSwap {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        String mWord = "Ngô Duy Bảo";
        for (int i = 0; i < mWord.length();i++){
            wStack.push(mWord.charAt(i));
        }
        String newStr = "";
        for (int i = 0; i < mWord.length();i++){
            newStr += wStack.pop();
        }
        System.out.println(newStr);
    }
}
