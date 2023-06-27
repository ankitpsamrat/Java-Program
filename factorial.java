import java.util.Scanner;

public class factorial {

    public static int printFactorial(int n) {
        int factorial = 1;

        if (n < 0) {
            System.out.println("Invalid number");
        }

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Factorial : " + printFactorial(a));

        sc.close();
    }
}
