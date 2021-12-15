import java.awt.*;

public class create_list {

    Frame f; // Creates object of Frame, List, Label and String array
    List list;
    Label lb1;
    String[] country;

    create_list() {
        f = new Frame("AWT List");
        list = new List(6); // Creates a list
        lb1 = new Label("Select your country from the list : ");
        list.add("India"); // Adding items in the list
        list.add("Australia");
        list.add("America");
        list.add("Russia");
        list.add("France");
        list.add("China");
        f.add(lb1); // Add label and list on the Frame
        f.add(list);
        f.setLayout(new FlowLayout()); // Set properties of the Frame
        f.setSize(500, 300);
        f.setVisible(true);
    }

    public static void main(String[] ar) {
        new create_list();
    }
}