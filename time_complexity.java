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
    }
}
