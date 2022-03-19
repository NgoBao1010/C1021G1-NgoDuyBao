package BT_Lam_Them;


class Number{
    int value;
}
public class Main {
    public static void main(String[] args) {
        Number n = new Number();
        n.value = 5;
        incre(n);
        System.out.println(n.value);
    }
    static void incre(Number n){
        n.value++;
    }
}



