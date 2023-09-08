import java.util.Scanner;

public class array_exa1 {

    // avarage of 'n' number

    public static void main(String[] args) {
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
