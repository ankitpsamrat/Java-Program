import java.util.Scanner;

public class fibnocci_no {
    public static void main(String[] args) { // using for loop
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input the value");
        // int n = sc.nextInt();
        int n = 11;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 0; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
