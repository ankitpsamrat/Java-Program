import java.util.*;

public class string3 {
    public static void main(String[] args) { // print any string in uppercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String a = sc.nextLine();
        System.out.print(a.toUpperCase());
        sc.close();
    }
}
