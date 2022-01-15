import java.util.Scanner;

public class print_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String s = sc.nextLine();
        System.out.print("Name : " + s);
        sc.close();
    }
}
