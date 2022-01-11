public class try_catch {
    public static void main(String[] args) {
        int a = 60;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (Exception e) {
            System.out.println("We failed to devide. Reason is : ");
            System.out.println(e); // reason print krne ke liye
        }
    }
}
