import java.util.Scanner;

public class large_value {
    public static void main(String[] args) { // large value between three number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        int temp = a > b ? a : b; // use ternary operator
        int large = c > temp ? c : temp; // use ternary operator
        System.out.println("Largest number is : " + large);
        sc.close();
    }
}
