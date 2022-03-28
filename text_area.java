import java.awt.*;
import javax.swing.*;

public class text_area {
    JFrame f;
    TextArea t;

    text_area() {
        f = new JFrame();
        t = new TextArea("Welcome to awt program");
        t.setBounds(10, 30, 200, 200);
        f.add(t);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new text_area();
    }
}
