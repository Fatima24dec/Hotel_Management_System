package jtf55;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaApplication49 {
    public static void main(String[] args) {
        // add frame
        JFrame frame = new JFrame("");
        frame.setSize(530, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // add label for the  title
        JLabel titleLabel = new JLabel(" Login Screen", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD,20));
        titleLabel.setForeground(Color.PINK);
        titleLabel.setBounds(160, 20, 200, 30);
        frame.add(titleLabel);

        // add panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(110, 70, 300, 100);
        frame.add(panel);

        // Username
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(45, 20, 80, 25);
        panel.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(110, 20, 150, 25);
        panel.add(userField);

        // Password
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(45, 60, 80, 25);
        panel.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(110, 60, 150, 25);
        panel.add(passField);

        // Login button
        JButton okButton = new JButton("OK");
        okButton.setBounds(415, 190, 70, 30);
        frame.add(okButton);

        //add logo
        ImageIcon icon = new ImageIcon("C:\\Users\\hmood\\OneDrive\\الصور\\سطح المكتب\\images22.jpg");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(15, 1, 100, 100);
        frame.add(imageLabel);
        
       
        JLabel message = new JLabel("");
        message.setBounds(120, 220, 200, 25);
        frame.add(message);

        
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equalsIgnoreCase("Fofo") && password.equals("porsche911")) {
                    JFrame welcomeFrame = new JFrame("");
                    welcomeFrame.setSize(650, 700);
                    welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    JLabel welcomeLabel = new JLabel("Welcoome to the COE Hotel", SwingConstants.CENTER);
                    welcomeFrame.add(welcomeLabel);
                    welcomeFrame.setVisible(true);
                    // Create buttons for Gym, Spa, Dining, and Room Booking
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout());

JButton gymButton = new JButton("Gym");
JButton spaButton = new JButton("Spa");
JButton diningButton = new JButton("Dining");
JButton roomBookingButton = new JButton("Room Booking");

// Add buttons to the button panel
buttonPanel.add(gymButton);
buttonPanel.add(spaButton);
buttonPanel.add(diningButton);
buttonPanel.add(roomBookingButton);

// Add the button panel to the welcome frame
welcomeFrame.add(buttonPanel, BorderLayout.SOUTH);

// Add action listeners for the buttons
gymButton.addActionListener(e1 -> JOptionPane.showMessageDialog(welcomeFrame, "Gym feature coming soon!"));
spaButton.addActionListener(e1 -> JOptionPane.showMessageDialog(welcomeFrame, "Spa feature coming soon!"));
diningButton.addActionListener(e1 -> JOptionPane.showMessageDialog(welcomeFrame, "Dining feature coming soon!"));
roomBookingButton.addActionListener(e1 -> JOptionPane.showMessageDialog(welcomeFrame, "Room Booking feature coming soon!"));

welcomeFrame.setVisible(true);


                } else {
                    message.setText("Sorry, please check");
                }
            }
        });

        frame.setVisible(true);
        
    }
    
}