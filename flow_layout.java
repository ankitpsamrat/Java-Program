import java.awt.*;
import javax.swing.*;

public class flow_layout {
    JFrame f;
    JButton b1, b2, b3, b4, b5, b6;

    flow_layout() {
        f = new JFrame();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new flow_layout();
    }
}
