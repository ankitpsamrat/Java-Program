public class type_conversion {

    public static void main(String[] args) {

        // Converts double to int
        double num = 10.5;
        int convertedDouble = (int) num;
        System.out.println(convertedDouble);

        // Converts float to long
        float price = 100.5f;
        long convertedPrice = (long) price;
        System.out.println(convertedPrice);

        // Converts char to int
        char character = 'A';
        int convertedCharacter = (int) character;
        System.out.println(convertedCharacter);

        // Convert string to int
        String numStr = "42";
        int convertedString = Integer.parseInt(numStr);
        System.out.println(convertedString);

        // Convert int to string
        int numInt = 42;
        String convertedInt = String.valueOf(numInt);
        System.out.println(convertedInt);
    }
}
