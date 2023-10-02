public class recursion {
    // The process in which a function calls itself directly or indirectly is called
    // recursion and the corresponding function is called a recursive function.

    // print 5 to 1
    // public static void num(int n) {
    // if (n == 0) {
    // return;
    // } else {
    // System.out.print(n + " ");
    // num(n - 1);
    // }
    // }

    // print 1 to 5
    public static void num(int n) {
        if (n == 6) {
            return;
        } else {
            System.out.print(n + " ");
            num(n + 1);
        }
    }

    public static void main(String[] args) {
        // for 5 to 1
        // num(5);

        // for 1 to 5
        num(1);
    }
}