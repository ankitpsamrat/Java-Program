import java.util.Scanner;

public class condition_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are Adult!");
        } else {
            System.out.println("You are not Adult!");
        }
        sc.close();
    }
}
