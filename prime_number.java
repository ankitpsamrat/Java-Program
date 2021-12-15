import java.util.Scanner;

public class prime_number {
    public static void main(String arg[]) { // using static method
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeCal(n);
        sc.close();
    }

    static void primeCal(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Prime number ");
        else
            System.out.println("Not a prime number ");
    }
}
