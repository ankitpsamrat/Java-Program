public class recursion2 {

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
        int n = 1;
        num(n);
    }
}