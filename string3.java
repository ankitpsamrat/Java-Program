import java.util.*;

public class string3 {
    public static void main(String[] args) { // uppercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name : ");
        String a = sc.nextLine();
        System.out.print(a.toUpperCase());
        sc.close();
    }
}
