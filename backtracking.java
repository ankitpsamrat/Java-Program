public class backtracking {
    // find all possible solution and
    // use the one you want.

    public static void generatePermutations(String input) {
        char[] inputArray = input.toCharArray();
        generatePermutations(inputArray, 0);
    }

    private static void generatePermutations(char[] inputArray, int currentIndex) {
        if (currentIndex == inputArray.length - 1) {
            // If we have reached the last character, print the permutation
            System.out.println(new String(inputArray));
        } else {
            // Try all possible swaps for the current position
            for (int i = currentIndex; i < inputArray.length; i++) {
                // Swap characters at currentIndex and i
                char temp = inputArray[currentIndex];
                inputArray[currentIndex] = inputArray[i];
                inputArray[i] = temp;

                // Recursively generate permutations for the remaining characters
                generatePermutations(inputArray, currentIndex + 1);

                // Undo the swap (backtrack) to explore other possibilities
                temp = inputArray[currentIndex];
                inputArray[currentIndex] = inputArray[i];
                inputArray[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        generatePermutations("ABC");
    }
}
