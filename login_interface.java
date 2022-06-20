import javax.swing.*;

public class login_interface {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page"); // create frame
        frame.setSize(350, 200); // set size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true); // set visibility of the frame
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User"); // create JLabel
        userLabel.setBounds(10, 20, 80, 25); // set size of the lable
        panel.add(userLabel);

        JTextField userText = new JTextField(20); // create user input field
        userText.setBounds(100, 20, 165, 25); // set size of the field
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password"); // create password input field
        passwordLabel.setBounds(10, 50, 80, 25); // set size of the field
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login"); // create login button
        loginButton.setBounds(10, 80, 80, 25); // set size of the field
        panel.add(loginButton);
    }

}