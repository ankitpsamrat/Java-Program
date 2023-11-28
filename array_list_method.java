import java.util.ArrayList;
import java.util.Collections;

public class array_list_method {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        System.out.println(arr);

        // get element
        int element = arr.get(1);
        System.out.println(element);

        // add element
        arr.add(3, 3);
        System.out.println(arr);

        // set element
        arr.set(0, 4);
        System.out.println(arr);

        // remove element
        arr.remove(0);
        System.out.println(arr);

        // size
        System.out.println(arr.size());

        // sorting
        Collections.sort(arr);
        System.out.println(arr);
    }
}
