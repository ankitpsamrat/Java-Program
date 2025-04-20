class Animal1 {
    void makeSound() {
        System.out.println("Animal");
    }
}

class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal1 {
    void makeSound() {
        System.out.println("Cat");
    }
}

public class polymorphism_exa {

    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        animal.makeSound();

        Dog1 dog = new Dog1();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
