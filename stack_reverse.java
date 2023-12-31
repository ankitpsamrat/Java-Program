import java.util.Stack;

public class stack_reverse {

    private static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int element = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, element);
    }

    private static void insertAtBottom(Stack<Integer> stack, int element) {
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, element);
        stack.push(top);
    }

    private static void printStack(Stack<Integer> stack) {
        for (Integer element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: ");
        printStack(stack);

        reverseStack(stack);

        System.out.println("Reversed stack:");
        printStack(stack);
    }
}
