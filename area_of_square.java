import java.util.Scanner;

public class area_of_square {

    public static void main(String[] args) {
        System.out.print("Enter side of square : ");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = side * side;
        System.out.print("Area of square : " + area);
        sc.close();
    }
}