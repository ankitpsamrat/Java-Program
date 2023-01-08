import java.util.Scanner;

public class sum_of_natural_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input natural no : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.print("Sum is : " + sum);
        sc.close();
    }
}
