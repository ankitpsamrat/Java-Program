import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Division : " + (a / b));
        sc.close();
    }
}
