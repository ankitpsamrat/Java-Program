class Student {
    String name;

    void printName(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class keyword_this {

    public static void main(String[] args) {
        Student student = new Student();
        student.printName("John");
    }
}
