public class operator_decrement {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // pre decrement(change value then use)
        // b = --a;
        // System.out.println(a);
        // System.out.println(b);

        // post decrement(use value then change)
        b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}
