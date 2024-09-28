package Day7;
import java.util.Stack;
public class Day7_Stack {

    public static void main(String[] args) {
        // Declare a stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("Initial stack: " + stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        System.out.println("Stack after removing 4 elements: " + stack);
    }
}