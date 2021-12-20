import javax.swing.*;

public class create_password {
    public static void main(String[] args) {
        JFrame passWord_f = new JFrame("Password");
        JPasswordField passWord_value = new JPasswordField();
        JLabel passWord_l1 = new JLabel("Password ");
        passWord_l1.setBounds(20, 100, 100, 30);
        passWord_value.setBounds(100, 100, 100, 30);
        passWord_f.add(passWord_value);
        passWord_f.add(passWord_l1);
        passWord_f.setSize(500, 300); // set size of the frame
        passWord_f.setLayout(null); // set default layout for the frame
        passWord_f.setVisible(true); // set visibility of the frame
    }
}
