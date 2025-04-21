// Search a Character index in a String

public class search_character {

    public static int searchCharacter(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchCharacter("geeksforgeeks", 'k'));
    }
}
