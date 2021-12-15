import java.util.Scanner;

public class array2 {
    public static void main(String[] args) { // avarage of 'n' number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the mark");
        int n = sc.nextInt();
        int mark[] = new int[n];
        for (int i = 0; i < n; i++) {
            mark[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < n; i++) {
            avg = avg + mark[i];
            avg = avg / n;
            System.out.println("Avarage mark = " + avg);
        }
        sc.close();
    }
}
