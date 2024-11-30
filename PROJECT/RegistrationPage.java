package PROJECT;

import javax.swing.*;
import java.awt.*;

public class RegistrationPage extends JFrame {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField;
    private JButton submitButton, cancelButton;

    public RegistrationPage() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2)); // Using GridLayout for structured form layout

        // Initialize components
        usernameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        submitButton = new JButton("Submit");
        cancelButton = new JButton("Cancel");

        // Add components to JFrame
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Email ID:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(submitButton);
        add(cancelButton);

        // Action listeners for the buttons
        submitButton.addActionListener(e -> registerAccount());
        cancelButton.addActionListener(e -> cancelRegistration());

        setLocationRelativeTo(null); // Center the frame
        setVisible(true); // Make the frame visible
    }

    private void registerAccount() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if (!email.endsWith("bits-pilani.ac.in")) {
            JOptionPane.showMessageDialog(this, "Use your BITS Email ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (CredentialsManager.registerNewUser(username, email, password)) {
            JOptionPane.showMessageDialog(this, "Registration successful.");
            dispose(); // Close the registration window on successful registration
            new LoginPage().setVisible(true); // Optionally open the login page
        } else {
            JOptionPane.showMessageDialog(this, "Username already exists or registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelRegistration() {
        dispose(); // Close the registration window
        new LoginPage().setVisible(true); // Open the login page
    }
}