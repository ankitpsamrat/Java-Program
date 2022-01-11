class student1 { // create class

    private int id;
    private String name;

    public void setId(int i) { // create setter method
        id = i;
    }

    public int getId() { // create getter method
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        student1 obj = new student1(); // create object for class
        obj.setId(1);
        obj.setName("Samrat");
        System.out.println(obj.getId());
        System.out.print(obj.getName());
    }
}