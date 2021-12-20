import java.util.Scanner;

public class simple_interest {
    public static void main(String args[]) { // find simple interest
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        float p = sc.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        float r = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        float t = sc.nextFloat();
        float sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is : " + sinterest);
        sc.close();
    }
}