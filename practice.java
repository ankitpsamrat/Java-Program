// check person age by various methods

public class practice {

    // method to check person age
    static boolean checkAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int age = 25;

        // using ternary operator
        // System.out.println((age >= 18) ? "You are an adult" : "You are a minor");

        // using if else
        // if (age >= 18) {
        // System.out.println("You are an adult");
        // } else {
        // System.out.println("You are a minor");
        // }

        // using switch case
        // switch (age >= 18) {
        // case true:
        // System.out.println("You are an adult");
        // break;
        // case false:
        // System.out.println("You are a minor");
        // break;
        // }

        // using method
        if (checkAge(age)) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    }
}
