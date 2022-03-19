package ss19_String_and_Regex.Bai_tap.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME_REGEX = "^[CAP]+[0-9]{4}[GHIKLM]$";

    public ClassNameExample() {
    }
    public boolean validate(String regax){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regax);
        return matcher.matches();
    }
}
