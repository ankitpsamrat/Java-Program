import java.awt.*;
import javax.swing.*;

public class text_field {
    JFrame f;
    TextField t1, t2;

    text_field() {
        f = new JFrame();
        t1 = new TextField();
        t1.setBounds(50, 50, 200, 30);
        t2 = new TextField();
        t2.setBounds(50, 100, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new text_field();
    }
}
