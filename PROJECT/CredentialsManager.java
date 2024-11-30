package PROJECT;

import java.util.HashMap;

public class CredentialsManager {
    // Static hashmap to store user credentials.
    private static HashMap<String, String> userAccounts = new HashMap<>();

    // Static initializer block to add predefined accounts
    static {
        // Add predefined account with username 'admin' and password '1234'
        userAccounts.put("admin", "1234");
    }

    // Method to validate user credentials during login.
    public static boolean validate(String username, String password) {
        return userAccounts.containsKey(username) && userAccounts.get(username).equals(password);
    }

    // Method to register a new user. Returns true if registration is successful, false if username already exists.
    public static boolean registerNewUser(String username, String email, String password) {
        if (userAccounts.containsKey(username)) {
            return false; // Username already exists
        } else {
            userAccounts.put(username, password); // Register new user
            return true; // Registration successful
        }
    }
}