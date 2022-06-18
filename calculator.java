import java.util.Scanner;

class calculator {

    public static void main(String[] args) { // simple calculator
        Double res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an operator +, -, *, or / : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        switch (operator) {
            case '+':
                res = num1 + num2;
                System.out.println("Result : " + num1 + " + " + num2 + " = " + res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("Result : " + num1 + " - " + num2 + " = " + res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("Result : " + num1 + " * " + num2 + " = " + res);
                break;
            case '/':
                res = num1 / num2;
                System.out.println("Result : " + num1 + " / " + num2 + " = " + res);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        sc.close();
    }
}