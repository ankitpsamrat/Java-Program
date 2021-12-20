import java.util.Scanner;

public class temperature_convert {
    public static void main(String arg[]) { // convert temperature Fahrenheit to Celsius and Celsius to Fahrenheit
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of conversion");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter Fahrenheit temperature : ");
                double f = sc.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.println("Celsius temperature is : " + c);
                break;
            case 2:
                System.out.print("Enter Celsius temperature : ");
                c = sc.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit temperature is : " + f);
                break;
            default:
                System.out.println("please choose valid choice");
                sc.close();
        }
    }
}
