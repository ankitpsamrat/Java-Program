import java.util.Scanner;

public class for_loop2 {
    public static void main(String[] args) { // multiplication of 'n' number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int multi = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            multi = multi * i;
        }
        System.out.print("Multi : " + multi);
        sc.close();
    }
}
