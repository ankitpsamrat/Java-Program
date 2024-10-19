class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void start() {
        super.start(); // calls the start() method of the Vehicle class
        System.out.println("Car started");
    }
}

public class keyword_super {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
