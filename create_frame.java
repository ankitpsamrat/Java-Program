import java.awt.*;

public class create_frame extends Frame {
    create_frame() {
        Button b = new Button("Button!!");
        b.setBounds(50, 50, 50, 50); // set button position on screen
        add(b); // add button into the frame
        setSize(500, 300); // set size of the frame
        setTitle("This is my First AWT example"); // set title of the frame
        setLayout(new FlowLayout()); // set layout for the frame
        setVisible(true); // set visibility of the frame
    }

    public static void main(String args[]) {
        new create_frame();
    }
}
