import java.util.Scanner;

public class method3 {

    static int multi(int x, int y) { // multiplication of two number using method
        int z = (x * y);
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int c = multi(a, b);
        System.out.print("Multi : " + c);
        sc.close();
    }
}
