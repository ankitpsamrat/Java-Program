// ths is a process of hiding the implementation details
// and showing only functionality to the user.
// abstract class is declared with the abstract keyword.

// abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// inherit class extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "ankit";
        int age = 21;

        System.out.println(name);
        System.out.println(age);
    }
}

public class abstract_class {

    public static void main(String args[]) {
        // create object for inherit class
        Employee s = new Employee();
        s.printInfo();
    }
}
