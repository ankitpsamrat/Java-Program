import java.util.Scanner;

public class operator_logical {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();

        // AND operator
        if (a >= 1 & a <= 100) {
            System.out.print("Number is in range");
        }

        // OR operator
        // if (a >= 1 || a <= 100) {
        // System.out.print("Number is in range");
        // }
        else
            System.out.print("Number is not in range");
        sc.close();
    }
}
