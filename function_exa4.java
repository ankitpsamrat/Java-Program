import java.util.Scanner;

public class function_exa4 {

    public static String fullName(String firstName, String middleName, String lastName) {
        String n = firstName + " " + middleName + " " + lastName;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String a = sc.next();
        System.out.print("Enter middle name : ");
        String b = sc.next();
        System.out.print("Enter last name : ");
        String c = sc.next();
        String name = fullName(a, b, c);
        System.out.println("Your name : " + name);
        sc.close();
    }
}
