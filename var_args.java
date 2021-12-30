public class var_args {

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Sum of 4 and 5 is : " + sum(4, 5));
        System.out.print("Sum of 4, 10 and 16 is : " + sum(4, 5, 16));

    }
}
