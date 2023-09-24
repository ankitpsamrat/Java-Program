public class dsa_insertion_sort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
