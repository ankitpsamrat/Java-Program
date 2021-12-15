import java.awt.*;

public class create_checkbox {
    Frame f; // Creates object of Frame and Checkbox
    Checkbox cb1, cb2;

    create_checkbox() {
        f = new Frame("AWT Checkbox");
        cb1 = new Checkbox("Yes", true); // Creates a pre-selected Checkbox with a message
        cb2 = new Checkbox("No"); // Creates an unselected Checkbox with a message
        f.add(cb1); // Add Checkboxes on the Frame
        f.add(cb2);
        f.setLayout(new GridLayout()); // Set properties of the Frame
        f.setSize(500, 300);
        f.setVisible(true);
    }

    public static void main(String[] ar) {
        new create_checkbox();
    }
}
