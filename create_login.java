import java.awt.*;

public class create_login extends Frame {

    create_login() {
        Label firstName = new Label("First Name");
        firstName.setBounds(20, 50, 80, 20);
        Label lastName = new Label("Last Name");
        lastName.setBounds(20, 80, 80, 20);
        Label dob = new Label("Date of Birth");
        dob.setBounds(20, 110, 80, 20);
        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);
        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);
        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);
        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 100, 30);
        Button reset = new Button("Reset");
        reset.setBounds(120, 160, 100, 30);
        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);
        setSize(500, 300); // set size of the frame
        setLayout(null); // set default layout for the frame
        setVisible(true); // set visibility of the frame
    }

    public static void main(String[] args) {
        new create_login();
    }
}