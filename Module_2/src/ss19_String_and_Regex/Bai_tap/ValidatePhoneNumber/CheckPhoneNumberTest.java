package ss19_String_and_Regex.Bai_tap.ValidatePhoneNumber;

public class CheckPhoneNumberTest {
    public static final String[] validPhoneNumber = {"(84)-(978489648)","(84)-(989642710)"};
    public static final String[] invalidPhoneNumber = {"(a8)-(22222222)","(84)-(9AB42710)"};
    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        for (String phoneNum : validPhoneNumber){
            boolean isValid = checkPhoneNumber.validate(phoneNum);
            System.out.println("Phone Number " + phoneNum + " is valid " + isValid);
        }
        for (String phoneNum : invalidPhoneNumber){
            boolean isValid = checkPhoneNumber.validate(phoneNum);
            System.out.println("Phone Number " + phoneNum + " is valid " + isValid);
        }
    }
}
