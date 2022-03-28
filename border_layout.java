import java.awt.BorderLayout;
import javax.swing.*;

public class border_layout {
    JFrame f;
    JButton b1, b2, b3, b4, b5;

    border_layout() {
        f = new JFrame();
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("West");
        b5 = new JButton("Center");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new border_layout();
    }
}
