import java.util.Scanner;

public class decimal_octal {
    static int i = 1;

    public static void main(String args[]) { // decimal to octal conversion
        int dec, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        dec = sc.nextInt();
        System.out.print("Octal number is : ");
        int a[] = new int[50];
        while (dec != 0) {
            a[i++] = dec % 8;
            dec = dec / 8;
        }
        for (int c = i - 1; c >= 0; c--) {
            System.out.print(a[c]);
        }
        sc.close();
    }
}
