class Adder { // create class

    static int add(int a, int b) { // create method
        return a + b;
    }

    static int add(int a, int b, int c) { // create method
        return a + b + c;
    }
}

public class method_overloading { // overloading when data type are same
    public static void main(String[] args) {
        System.out.println("Addition : " + Adder.add(10, 10));
        System.out.println("Addition : " + Adder.add(10, 10, 10));
    }
}