import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Addition : " + (a + b));
        sc.close();
    }
}
