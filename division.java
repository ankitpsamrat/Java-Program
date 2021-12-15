import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Division = " + (a / b));
        sc.close();
    }
}
