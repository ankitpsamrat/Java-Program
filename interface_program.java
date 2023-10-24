// An interface in Java is a blueprint of a class.
// It has static constants and abstract methods.
// abstract class is declared with the interface keyword.

// interface class
interface Animal {
    public void walk();
}

// create implement class
class Horse implements Animal {
    public void walk() {
        System.out.println("Animal can walk");
    }
}

public class interface_program {

    public static void main(String[] args) {
        // create object for implement class
        Horse obj = new Horse();
        obj.walk();
    }
}
