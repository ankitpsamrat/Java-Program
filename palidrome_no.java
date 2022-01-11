import java.util.Scanner;

public class palidrome_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num = sc.nextInt();
        int reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
        sc.close();
    }
}
// example
// 3553
// 2552