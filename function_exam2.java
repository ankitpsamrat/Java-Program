import java.util.Scanner;

public class function_exam2 {

    public static int sumOfTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        int sum = sumOfTwoNumber(a, b);
        System.out.println("Total sum : " + sum);
        sc.close();
    }
}
