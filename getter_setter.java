class student1 {

    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        student1 obj = new student1();
        obj.setId(1);
        obj.setName("Samrat");
        System.out.println(obj.getId());
        System.out.print(obj.getName());
    }
}