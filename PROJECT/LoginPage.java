package PROJECT;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton;

    public LoginPage() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        // Create components
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Add components to JFrame
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);
        add(registerButton);

        // Action listeners
        loginButton.addActionListener(e -> performLogin());
        registerButton.addActionListener(e -> openRegistrationPage());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (CredentialsManager.validate(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            RideSharePage rideSharePage = new RideSharePage();
            rideSharePage.setUsername(username);  // Pass the username to RideSharePage
            rideSharePage.setVisible(true);
            dispose();  // Close the login window
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void openRegistrationPage() {
        new RegistrationPage().setVisible(true);
        dispose();
    }
}