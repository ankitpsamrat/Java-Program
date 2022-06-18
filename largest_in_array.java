import java.util.Scanner;

public class largest_in_array {

    public static void main(String[] args) { // find largest value from array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum value : " + max);
        sc.close();
    }
}