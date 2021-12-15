import java.util.Scanner;

public class string {
    public static void main(String[] args) { // print name
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name");
        String a = sc.nextLine();
        System.out.println(a);
        sc.close();
    }
}
