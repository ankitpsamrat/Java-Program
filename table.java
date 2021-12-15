import java.util.Scanner;

public class table {
    public static void main(String[] args) { // table of any number using for loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value : ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(a * i + " ");
        }
        sc.close();
    }
}
