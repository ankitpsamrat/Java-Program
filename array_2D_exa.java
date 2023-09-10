import java.util.Scanner;

public class array_2D_exa {

    // search element in 2D array

    public static void main(String[] args) {
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

        // search input
        int x = sc.nextInt();

        // output loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {

                if (num[i][j] == x) {
                    System.out.println("Input value found at : (" + i + ", " + j + ")");
                }
            }
        }
        sc.close();
    }
}
