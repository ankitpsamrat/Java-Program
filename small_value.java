import java.util.Scanner;

public class small_value {
    public static void main(String[] args) { // using ternary operator
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        int temp = a < b ? a : b;
        int small = c < temp ? c : temp;
        System.out.println("Smallest number is : " + small);
        sc.close();
    }
}
