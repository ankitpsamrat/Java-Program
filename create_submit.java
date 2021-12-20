import java.awt.*;

class submit {
    submit() { // initializing using constructor
        Frame f = new Frame(); // creating a Frame
        Label l = new Label("Employee id:"); // creating a Label
        Button b = new Button("Submit"); // creating a Button
        TextField t = new TextField(); // creating a TextField
        l.setBounds(20, 80, 80, 30); // setting position of above components in the frame
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);
        f.add(b); // adding components into frame
        f.add(l);
        f.add(t);
        f.setSize(500, 300); // frame size
        f.setTitle("Employee info"); // setting the title of frame
        f.setLayout(null); // set default layout for the frame
        f.setVisible(true); // setting visibility of frame
    }

    public static void main(String args[]) {
        new submit();
    }
}