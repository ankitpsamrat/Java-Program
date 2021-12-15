import java.util.Scanner;

public class string2 {
    public static void main(String[] args) { // lowercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name : ");
        String a = sc.nextLine();
        System.out.print(a.toLowerCase());
        sc.close();
    }
}
