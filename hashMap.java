import java.util.*;

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        // print all value
        System.out.println(map);

        // print single value
        System.out.println(map.get("India"));

        // search
        if (map.containsKey("India")) {
            System.out.println("Key is contain");
        } else {
            System.out.println("Key is not contain");
        }

        // iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            // to get keys only
            System.out.println(e.getKey());

            // to get value only
            System.out.println(e.getValue());
        }

        // remove
        map.remove("China");

        // size
        map.size();
    }
}
