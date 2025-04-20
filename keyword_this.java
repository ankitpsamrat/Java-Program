class Students {
    String name;

    void printName(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class keyword_this {

    public static void main(String[] args) {
        Students student = new Students();
        student.printName("John");
    }
}
