// Getters and setters are accessor methods in Java that are
// used to retrieve and set the values of private variables

// create class
class student1 {
    private int id;
    private String name;

    // create setter method
    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    // create getter method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class getter_setter {

    public static void main(String[] args) {
        // create object for class
        student1 obj = new student1();

        // assign value to setter method
        obj.setId(1);
        obj.setName("Samrat");

        // access value using getter method
        System.out.println(obj.getId());
        System.out.print(obj.getName());
    }
}