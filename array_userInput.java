import java.util.Scanner;

public class array_userInput {

    public static void main(String[] args) {
        System.out.println("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        // input array value
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        // output array value
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
        sc.close();
    }
}
