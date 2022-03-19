package ss7_Abstract_Class_and_Interface.Thuc_hanh.Fruit;

public class Test {
    public static void main(String[] args) {
       Fruit[] fruits = {new Orange(),new Apple()};
       for (Fruit fruit: fruits){
           System.out.println(fruit.howToEat());
       }
    }
}
