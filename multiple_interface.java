interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Implementing multiple interfaces
class Duck implements Flyable, Swimmable {

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}

public class multiple_interface {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}
