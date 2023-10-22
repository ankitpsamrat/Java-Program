class Animal {
    void makeSound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat");
    }
}

public class polymorphism_exa {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
