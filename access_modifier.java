// Access modifiers are the keywords that are used for controlling
// the use of the methods, constructors, fields, and methods in a class.

// create class
class Modifiers {

    int z = 6; // default
    public int x = 5;
    protected int y = 45;
    private int a = 78;

    // create method for this modifiers
    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class access_modifier {

    public static void main(String[] args) {
        // create object for class
        Modifiers obj = new Modifiers();
        obj.meth1();
    }
}
