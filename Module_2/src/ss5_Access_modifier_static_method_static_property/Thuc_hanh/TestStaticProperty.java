package ss5_Access_modifier_static_method_static_property.Thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car oto = new Car("BMW","V4");
        System.out.println(Car.numberOfCars);
        Car oto1 = new Car("Mercedes","V4");
        System.out.println(Car.numberOfCars);
        System.out.println(oto.getName());
    }
}
