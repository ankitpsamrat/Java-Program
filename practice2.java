// print avarage of two number

public class practice2 {

    // method for avarage
    static int avarage(int a, int b) {
        int avg2 = (a + b) / 2;

        return avg2;
    }

    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 14;

        // normal way
        // int avg = (a1 + b1) / 2;
        // System.out.println("Avarage is: " + avg);

        // using method
        System.out.println("Avarage is: " + avarage(a1, b1));
    }
}
