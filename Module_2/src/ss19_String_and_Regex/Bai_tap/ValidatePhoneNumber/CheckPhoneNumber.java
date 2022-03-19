package ss19_String_and_Regex.Bai_tap.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
        private static final String PHONE_NUMBER = "^\\(84\\)\\-\\([0-9]{9}\\)$";

    public CheckPhoneNumber() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
