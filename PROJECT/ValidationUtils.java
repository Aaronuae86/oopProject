package PROJECT;

public class ValidationUtils {
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    public static boolean isValidMobile(String mobile) {
        return mobile != null && mobile.matches("^(05)\\d{8}$");
    }
}