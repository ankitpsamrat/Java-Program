import java.util.Scanner;

public class area_of_circle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle : " + area);
        sc.close();
    }
}
