package ss5_Access_modifier_static_method_static_property.Bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student hocSinh1 = new Student();
        hocSinh1.setName("Duy Thựn");
        System.out.println(hocSinh1.getName());
        hocSinh1.setClasses("C10");
        System.out.println(hocSinh1.getClasses());
    }
}
