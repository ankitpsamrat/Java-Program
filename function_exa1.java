import java.util.Scanner;

public class function_exa1 {

    public static void printName(String name) {
        System.out.println(name);
        // return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        printName(name);
        sc.close(); 
    }
}
