import java.util.Scanner;

public class method2 {

    static int sum(int x, int y) { // sum of two number using method
        int z = (x + y);
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = sum(a, b);
        System.out.print("Sum : " + c);
        sc.close();
    }
}
