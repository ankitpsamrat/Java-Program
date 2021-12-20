import java.awt.*;

public class create_helloworld {
    public create_helloworld() {
        Frame f = new Frame();
        Button btn = new Button("Hello World");
        btn.setBounds(80, 80, 100, 50); // set button position on screen
        f.add(btn); // add button into the frame
        f.setSize(500, 300); // set size of the frame
        f.setTitle("AWT"); // set title of the frame
        f.setLayout(null); // set default layout for the frame
        f.setVisible(true); // set visibility of the frame
    }

    public static void main(String[] args) {
        new create_helloworld();
    }
}