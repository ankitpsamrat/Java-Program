import java.util.Scanner;

public class array_2D {

    public static void main(String[] args) {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();

        int[][] num = new int[row][colm];

        // input loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        // output loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
