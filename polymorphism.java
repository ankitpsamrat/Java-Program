// The word polymorphism means having many forms

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + ":" + age);
    }
}

public class polymorphism {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Samrat";
        obj.age = 21;

        obj.printInfo(obj.name);
        obj.printInfo(obj.age);
        obj.printInfo(obj.name, obj.age);
    }
}
