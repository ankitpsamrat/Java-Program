// A class that inherits from another class can reuse the methods
// and fields of that class. In addition, you can add new fields
// and methods to your current class as well. 

// base class
class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}

// derived(inherit) class
class Dog extends Animal2 {
    void bark() {
        System.out.println("barking...");
    }
}

public class inheritance {

    public static void main(String args[]) {
        // create object for inherit class
        Dog d = new Dog();
        d.bark();

        // eat method inherit from animal class
        d.eat();
    }
}