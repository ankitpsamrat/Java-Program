public class operator_increment {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // pre increment(change value then use)
        // b = ++a;
        // System.out.println(a);
        // System.out.println(b);

        // post increment(use value then change)
        b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
