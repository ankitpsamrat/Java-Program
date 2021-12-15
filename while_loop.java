import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastdigit = temp % 10;
            temp = temp / 10;
            // temp /= 10; // aise bhi likha jata h
            sum = sum + lastdigit;
            // sum += lastdigit; // ise bhi likh skte h
        }
        System.out.print("Sum of input value : " + sum);
        sc.close();
    }
}
