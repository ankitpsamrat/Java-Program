import java.awt.*;

public class create_frame extends Frame {
    create_frame() {
        Button b = new Button("Button!!");
        b.setBounds(50, 50, 50, 50); // setting button position on screen
        add(b); // adding button into frame
        setSize(500, 300); // Setting Frame width and height
        setTitle("This is my First AWT example"); // Setting the title of Frame
        setLayout(new FlowLayout()); // Setting the layout for the Frame
        setVisible(true); // setting visibility of frame
    }

    public static void main(String args[]) {
        new create_frame();

    }
}
