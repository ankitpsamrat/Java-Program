import javax.swing.*;

public class label {
    JFrame f;
    JLabel lb;

    label() {
        f = new JFrame();
        lb = new JLabel("Welcome");
        f.add(lb);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new label();
    }
}
