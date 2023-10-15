// default constructor
// class Bike1 {
// Bike1() {
// System.out.println("Default constructor created");
// }
// }

// parameterized constructor
// class Bike2 {
//     String name;
//     String price;

//     public Bike2(String name, String price) {
//         this.name = name;
//         this.price = price;
//     }
// }

// copy constructor
class Bike3 {
    String name;
    String price;

    public Bike3(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Bike3(Bike3 obj) {
        this.name = obj.name;
        this.price = obj.price;
    }
}

public class constructor {

    public static void main(String args[]) {
        // calling default constructor
        // Bike1 obj1 = new Bike1();
        // aise bhi likha jata h
        // new Bike1();

        // calling parameterized constructor
        // Bike2 obj2 = new Bike2("Honda", "150000");
        // System.out.println("Bike name : " + obj2.name);
        // System.out.println("Bike prize : " + obj2.price);

        // calling copy constructor
        Bike3 obj3 = new Bike3("Tata", "150000");
        Bike3 obj4 = new Bike3(obj3);
        System.out.println("Bike name : " + obj4.name);
        System.out.println("Bike prize : " + obj4.price); 
    }
}