import java.util.Scanner;

public class area_of_triangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of triangle : ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle : ");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.print("Area of triangle : " + area);
        sc.close();
    }
}
