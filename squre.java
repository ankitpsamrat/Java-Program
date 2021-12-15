import java.util.Scanner;

public class squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Squre : " + (a * a));
        sc.close();
    }
}
