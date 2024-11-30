package PROJECT;

import javax.swing.*;
import java.awt.*;

public class RideSharePage extends JFrame {
    private JLabel usernameLabel;
    private String username;

    public RideSharePage() {
        setTitle("RideShare Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout(10, 10));

        JPanel optionsPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        JButton offerButton = new JButton("Offer a Ride");
        JButton askButton = new JButton("Ask for a Ride");
        optionsPanel.add(offerButton);
        optionsPanel.add(askButton);

        JPanel topPanel = new JPanel(new BorderLayout());
        usernameLabel = new JLabel("Logged in as: ");
        topPanel.add(usernameLabel, BorderLayout.WEST);

        JPanel rightButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton inboxButton = new JButton("Inbox");
        JButton logoutButton = new JButton("Logout");
        rightButtonPanel.add(inboxButton);
        rightButtonPanel.add(logoutButton);

        topPanel.add(rightButtonPanel, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);

        offerButton.addActionListener(e -> openOfferGUI());
        askButton.addActionListener(e -> openAskGUI());
        inboxButton.addActionListener(e -> openInboxGUI());
        logoutButton.addActionListener(e -> logout());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setUsername(String username) {
        this.username = username;
        usernameLabel.setText("Logged in as: " + username);
    }
    public String getUsername() {
            return username; // Return the logged-in username
    }

    private void openOfferGUI() {
        OfferGUI offerGUI = new OfferGUI(this);
        offerGUI.setVisible(true);
        this.setVisible(false);
    }

    private void openAskGUI() {
        AskGUI askGUI = new AskGUI(this);
        askGUI.setVisible(true);
        setVisible(false);
    }

    private void openInboxGUI() {
        InboxGUI inboxGUI = new InboxGUI(this);
        inboxGUI.setVisible(true);
        this.setVisible(false);
    }

    private void logout() {
        // Attempt to close any open child windows
        for (Frame frame : JFrame.getFrames()) {
            if (frame != this && frame.isVisible()) {
                frame.dispose();
            }
        }
        dispose();  // Close this main window
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }
}