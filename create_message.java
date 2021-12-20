import java.awt.*;

public class create_message {
    Frame f; // creates object of frame
    Label lb1, lb2, lb3, lb4; // create label of the frame

    create_message() {
        f = new Frame("AWT message");
        lb1 = new Label("Hi !");
        lb2 = new Label("Dear");
        lb3 = new Label("Have a great day, Take care !");
        lb4 = new Label("Thanks");
        lb4.setText("Thank you and love you !"); // set text on the labels
        f.add(lb1); // add labels on the frame
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);
        f.setLayout(new FlowLayout()); // set properties of the Frame
        f.setSize(260, 220); // set size of the frame
        f.setVisible(true); // set visibility of frame
    }

    public static void main(String[] ar) {
        new create_message();
    }
}
