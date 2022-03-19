package ss7_Abstract_Class_and_Interface.Thuc_hanh.Animal;

import ss7_Abstract_Class_and_Interface.Thuc_hanh.Interface.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken:  cục tácccccc!";
    }

    @Override
    public String howToEat() {
        return "Rán lên ăn ngon lém.";
    }
}
