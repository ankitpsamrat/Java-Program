import java.util.Scanner;

public class reverse_number {

    public static void main(String[] arg) { // using while loop
        int a, res = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while (n != 0) {
            a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        System.out.print("Reverse is : " + res);
        sc.close();
    }
}