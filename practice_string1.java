// total number of characters in a string

public class practice_string1 {

    public static void main(String[] args) {
        String string = "My name is samrat";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Total number of characters: " + count);
    }
}
