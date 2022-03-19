package ss7_Abstract_Class_and_Interface.Thuc_hanh.Animal;

import ss7_Abstract_Class_and_Interface.Thuc_hanh.Interface.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal: animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                ((Edible)animal).howToEat();
                System.out.println(animal);
            }
        }
    }
}
