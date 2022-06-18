import java.util.Scanner;

public class area_of_rectangle {

    public static void main(String[] args) { // calculate area of rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle : ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.print("Area of Rectangle is : " + area);
        sc.close();
    }
}
