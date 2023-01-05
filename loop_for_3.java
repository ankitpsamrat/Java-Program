import java.util.Scanner;

public class loop_for_3 {
    public static void main(String[] args) { // factorial of any number
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value : ");
        int fact = 1;
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.print("Factorial : " + fact);
        sc.close();
    }
}
