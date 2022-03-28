import java.awt.*;
import javax.swing.*;

public class awt_list {
    JFrame f;

    awt_list() {
        f = new JFrame();
        List l1 = new List(5);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        l1.setBounds(100, 100, 75, 75);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new awt_list();
    }
}
