import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginProgram extends JFrame implements ActionListener {
    JTextField loginField;
    JPasswordField passwordField;
    JButton okButton;

    public LoginProgram() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel loginLabel = new JLabel("Login:");
        panel.add(loginLabel);

        loginField = new JTextField(20);
        panel.add(loginField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        panel.add(passwordField);

        okButton = new JButton("OK");
        okButton.addActionListener(this);
        panel.add(okButton);

        add(panel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String username = loginField.getText();
            String password = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(this, "Olá " + username + ", sua senha é " + password);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginProgram();
            }
        });
    }
}
