import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Remove elements from the stack
        int poppedElement = stack.pop();
        System.out.println(poppedElement); // Prints 3

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println(topElement); // Prints 2

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty); // Prints false
    }
}