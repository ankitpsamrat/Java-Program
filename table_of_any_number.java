import java.util.Scanner;

public class table_of_any_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }
        sc.close();
    }
}
