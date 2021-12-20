import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        if (a >= 1 & a <= 100) { // logical AND operator use here
            System.out.print("Number is in range");
        }
        // if (a >= 1 || a <= 100) { // logical OR operator use here
        // System.out.print("Number is in range");
        // } 
        else
        System.out.print("Number is not in range");
        sc.close();
    }
}
