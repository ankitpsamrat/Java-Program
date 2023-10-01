public class recursion_exa2 {

    // factorial of n number
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("The factorial of " + num + " is : " + factorial(num));
    }
}
