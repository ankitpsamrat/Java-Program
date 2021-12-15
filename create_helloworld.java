import java.awt.*;

public class create_helloworld {
    public create_helloworld() {
        Frame f = new Frame();
        Button btn = new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn); // adding a new Button.
        f.setSize(500, 300); // setting size.
        f.setTitle("AWT"); // setting title.
        f.setLayout(null); // set default layout for frame.
        f.setVisible(true); // set frame visibility true.
    }

    public static void main(String[] args) {
        new create_helloworld();
    }
}