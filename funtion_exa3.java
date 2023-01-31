import java.util.Scanner;

public class funtion_exa3 {

    public static int multiplication(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        int a = sc.nextInt();
        System.out.print("Enter second no : ");
        int b = sc.nextInt();
        int mul = multiplication(a, b);
        System.out.println("Multiplication is : " + mul);
        sc.close();
    }
}
