public class operator_assignment {

    public static void main(String[] args) {
        int a, b = 2;

        // simple assignment operator
        a = 11;
        System.out.println(" = Operator : a = " + a);

        // add assignment operator
        a += b;
        System.out.println(" += Operator : a += b is : " + a);

        // subtract assignment operator
        a -= b;
        System.out.println(" -= Operator : a -= b is : " + a);

        // multiply assignment operator
        a *= b;
        System.out.println(" *= Operator : a *= b is : " + a);

        // division assignment operator
        a /= b;
        System.out.println(" /= Operator : a /= b is : " + a);

        // modulus assignment operator
        a %= b;
        System.out.println(" %= Operator : a %=b is : " + a);

        // Left shift assignment operator
        a <<= 2;
        System.out.println(" <<= Operator : a <<= 2 is : " + a);

        // Right shift assignment operator
        a >>= 2;
        System.out.println(" >>= Operator : a >>= 2 is : " + a);

        // Bitwise AND assignment operator
        a &= b;
        System.out.println(" &= Operator : a &= b is : " + a);

        // Bitwise OR assignment operator
        a |= 2;
        System.out.println(" |= Operator : a |= 2 is : " + a);

        // Bitwise XOR assignment operator
        a ^= 2;
        System.out.println(" ^= Operator : a ^= 2 is : " + a);
    }
}
