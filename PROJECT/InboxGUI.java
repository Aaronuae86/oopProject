package PROJECT;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class InboxGUI extends JFrame {
    private JList<String> messageList;
    private RideSharePage parent;

    public InboxGUI(RideSharePage parent) {
        this.parent = parent;
        setTitle("Inbox");
        setSize(400, 300);
        setLayout(new BorderLayout());

        messageList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(messageList);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            this.dispose();
            parent.setVisible(true);
        });

        add(scrollPane, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);

        loadMessages();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadMessages() {
        String username = parent.getUsername();
        List<Message> messages = MessageManager.getMessagesForUser(username);
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Message message : messages) {
            model.addElement((message.isRideRequest() ? "[Ride Request] " : "[Message] ") +
                    "From: " + message.getSender() + " - " + message.getContent());
        }

        messageList.setModel(model);
    }
}
