import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Multiplication : " + (a * b));
        sc.close();
    }
}
