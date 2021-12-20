import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) { // find mounth name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 1 to 12 : ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("January");
        }
        if (a == 2) {
            System.out.println("February");
        }
        if (a == 3) {
            System.out.println("March");
        }
        if (a == 4) {
            System.out.println("Aprail");
        }
        if (a == 5) {
            System.out.println("May");
        }
        if (a == 6) {
            System.out.println("June");
        }
        if (a == 7) {
            System.out.println("July");
        }
        if (a == 8) {
            System.out.println("August");
        }
        if (a == 9) {
            System.out.println("September");
        }
        if (a == 10) {
            System.out.println("October");
        }
        if (a == 11) {
            System.out.println("Novmber");
        }
        if (a == 12) {
            System.out.println("December");
        }  else {
            System.out.println("Invalid number");
        }
        sc.close();
    }
}
