class encap { // create class

    private int age;
    private String name;

    public void setAge(int age) { // create setter method
        this.age = age;
    }

    public int getAge() { // create getter method
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        encap obj = new encap(); // create object for class
        obj.setName("Samrat");
        obj.setAge(20);
        System.out.println("Name : " + obj.getName());
        System.out.println("Age : " + obj.getAge());
    }
}