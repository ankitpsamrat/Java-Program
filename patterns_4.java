// Print a pattern of * in the form of a triangle.

public class patterns_4 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
