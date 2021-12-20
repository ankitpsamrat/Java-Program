import java.awt.*;

public class create_checkbox {
    Frame f; // create object of the frame
    Checkbox cb1, cb2; // create checkbox of the frame

    create_checkbox() {
        f = new Frame("AWT Checkbox");
        cb1 = new Checkbox("Yes", true); // creates a pre-selected checkbox with a message
        cb2 = new Checkbox("No"); // creates an unselected checkbox with a message
        f.add(cb1); // add checkboxes into the frame
        f.add(cb2);
        f.setLayout(new GridLayout()); // set properties of the frame
        f.setSize(500, 300); // set size of the frame
        f.setVisible(true); // set visibility of the frame
    }

    public static void main(String[] ar) {
        new create_checkbox();
    }
}
