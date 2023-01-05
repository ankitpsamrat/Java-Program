import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) { // sum of 'n' number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.print("Sum : " + sum);
        sc.close();
    }
}
