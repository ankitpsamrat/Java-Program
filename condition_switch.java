import java.util.Scanner;

public class condition_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Tata");
                break;
            default:
            System.out.println("Invalid nomber");
            break;
        }
        sc.close();
    }
}
