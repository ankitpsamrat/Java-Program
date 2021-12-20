import java.util.Scanner;

public class switch_condition3 {
    public static void main(String[] args) { // calculetor
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first value : ");
        int a = sc.nextInt();
        System.out.print("Input secend value : ");
        int b = sc.nextInt();
        System.out.print("Input the operation : ");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println("Result : " + result);
        sc.close();
    }
}
