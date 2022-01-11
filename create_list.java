import java.awt.*;

public class create_list {
    Frame f; // create object of the frame
    List list; // create list of the frame
    Label lb1; // creare label of the frame
    String[] country; // create string array

    create_list() {
        f = new Frame("AWT List");
        list = new List(6); // create a list
        lb1 = new Label("Select your country from the list : ");
        list.add("India"); // add items in the list
        list.add("Australia");
        list.add("America");
        list.add("Russia");
        list.add("France");
        list.add("China");
        f.add(lb1); // add label on the frame
        f.add(list); // add list on the frame
        f.setLayout(new FlowLayout()); // set properties of the Frame
        f.setSize(500, 300); // set size of the frame
        f.setVisible(true); // set visibility of the frame
    }

    public static void main(String[] ar) {
        new create_list();
    }
}