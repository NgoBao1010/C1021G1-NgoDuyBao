package ss19_String_and_Regex.Bai_tap.ValidateClassName;

public class ClassNameExampleTest {


    public static final String[] validClassName = new String[] {"C0318GM","C1021G"};
    public static final String[] invalidClassName = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String classname: validClassName){
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("Class is " + classname + " is valid: " + isvalid);
        }
        for (String classname: invalidClassName){
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("Class is " + classname + " is valid: " + isvalid);
        }
    }
}
