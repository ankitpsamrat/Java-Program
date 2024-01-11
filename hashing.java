// hashSet method

import java.util.HashSet;

public class hashing {

    public static void main(String[] args) {
        // create hashSet
        HashSet<Integer> set = new HashSet<>();

        // insert value
        set.add(1);
        set.add(2);
        set.add(3);

        // contain
        if (set.contains(1)) {
            System.out.println("It contains 1");
        } else {
            System.out.println("Does not contains 1");
        }

        // delete
        set.remove(1);

        // size
        set.size();

        // print all element
        System.out.println(set);
    }
}
