public class try_catch2 {
    public static void main(String[] args) {
        int a = 60;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (Exception e) {
            System.out.println("Result : " + a / (b + 2));
        }
    }
}
