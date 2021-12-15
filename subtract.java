import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Subtract : " + (x - y));
        sc.close();
    }
}
