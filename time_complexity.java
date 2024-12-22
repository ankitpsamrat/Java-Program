public class time_complexity {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, };

        System.out.println(arr[0]);
        // time comlexity = O(1)

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // time comlexity = O(n)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
        // time comlexity = O(n^2)

        int n = 16;
        int steps = 0;

        while (n > 1) {
            n = n / 2;
            steps++;
            System.out.println("n: " + n);
        }
        System.out.println("Total steps: " + steps);
        // time comlexity = O(log n)
    }
}
