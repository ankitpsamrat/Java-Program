import java.util.Scanner;

public class condition_nested_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first value : ");
        int a = sc.nextInt();
        System.out.print("Input second value : ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.print("Both value is equal");
        } else if (a > b) {
            System.out.print("First value is greater");
        } else {
            System.out.print("First value is lesser");
        }
        sc.close();
    }
}
