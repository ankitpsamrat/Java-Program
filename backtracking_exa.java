public class backtracking_exa {
    // N-Queens problem, This means that no two queens
    // can be in the same row, column, or diagonal.

    public static void solveNQueens(int n) {
        int[] queens = new int[n];
        solve(queens, 0, n);
    }

    private static void solve(int[] queens, int row, int n) {
        if (row == n) {
            printSolution(queens);
        } else {
            for (int col = 0; col < n; col++) {
                if (isSafe(queens, row, col)) {
                    queens[row] = col;
                    solve(queens, row + 1, n);
                }
            }
        }
    }

    private static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printSolution(int[] queens) {
        int n = queens.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Change value to the desired board size
        solveNQueens(4);
    }
}