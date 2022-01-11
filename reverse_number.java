import java.util.Scanner;

public class reverse_number {
    public static void main(String[] arg) { // reverse of any number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int res = 0;
        while (n != 0) {
            int a = n % 10;
            res = (res * 10) + a;
            n = n / 10;
        }
        System.out.print("Reverse is : " + res);
        sc.close();
    }
}