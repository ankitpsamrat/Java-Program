class Animal { // create class

    void eat() { // create method
        System.out.println("eating...");
    }
}

class Dog extends Animal { // create inherit class
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}