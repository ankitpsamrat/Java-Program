import java.util.Scanner;

public class smallest_in_array {

    public static void main(String[] args) { // find smallest value from array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for (int i = 1; i < n; i++) {
            if (small > arr[i])
                small = arr[i];
        }
        System.out.println("Smallest value : " + small);
        sc.close();
    }
}