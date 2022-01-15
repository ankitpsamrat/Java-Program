class Adder1 { // create class

    static int add(int a, int b) { // create method
        return a + b;
    }

    static double add(double a, double b) { // create method
        return a + b;
    }
}

public class method_overloading2 { // overloading when data type are diffrent
    public static void main(String[] args) {
        System.out.println("Addition : " + Adder1.add(11, 11));
        System.out.println("Addition : " + Adder1.add(12, 12));
    }
}
