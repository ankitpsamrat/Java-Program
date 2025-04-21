// check two string are same or not

public class same_string {

    public static boolean areStringsSame(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        if (areStringsSame("abc", "abc")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
