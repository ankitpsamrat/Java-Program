public class recursion2 {
    // print 5 to 1

    public static void num(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            num(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        num(n);
    }
}