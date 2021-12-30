class Adder {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class method_overloading { // overloading when data type are same
    public static void main(String[] args) {
        System.out.println(Adder.add(10, 10));
        System.out.println(Adder.add(10, 10, 10));
    }
}
