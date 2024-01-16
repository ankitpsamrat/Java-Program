import java.util.*;

public class hashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);
        set.add(3);

        // print all value
        System.out.println(set);

        // search
        if (set.contains(1)) {
            System.out.println("It contains 1");
        } else {
            System.out.println("Does not contains 1");
        }

        // remove
        set.remove(1);

        // size
        set.size();
    }
}
