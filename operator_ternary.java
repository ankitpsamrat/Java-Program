public class operator_ternary {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // ternary operator
        int max = (a > b ? a : b);
        int max2 = (a < b ? a : b);
        System.out.println(max);
        System.out.println(max2);
    }
}
