package PROJECT;

import javax.swing.UIManager;

public class RideShareApp {
    public static void main(String[] args) {
        // Set the look and feel to the system's default to make it more integrated.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Launch the login page.
        java.awt.EventQueue.invokeLater(() -> new LoginPage().setVisible(true));
    }
}