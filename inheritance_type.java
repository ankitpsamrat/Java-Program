class LastName {
    public void lastName() {
        System.out.println("Samrat");
    }
}

// single inheritane
// class FirstName extends LastName {
// public void firstName() {
// System.out.println("Ankit");
// }
// }

// multilevel inheritance
class FirstName extends LastName {
    public void firstName() {
        System.out.println("Ankit");
    }
}

class MiddleName extends FirstName {
    public void middleName() {
        System.out.println("Pratap");
    }
}

public class inheritance_type {

    public static void main(String[] args) {
        // access single inheritance
        // FirstName obj = new FirstName();
        // obj.firstName();
        // obj.lastName();

        // access multilevel inheritance
        MiddleName obj = new MiddleName();
        obj.firstName();
        obj.middleName();
        obj.lastName();
    }
}
