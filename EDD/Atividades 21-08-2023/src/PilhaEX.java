import java.util.Stack;

public class PilhaEX {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(5);
        originalStack.push(10);
        originalStack.push(15);

        Stack<Integer> reversedStack = reverseStack(originalStack);

        // Imprimindo a pilha invertida
        while (!reversedStack.isEmpty()) {
            System.out.println(reversedStack.pop());
        }
    }

    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> reversed = new Stack<>();
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }
        return reversed;
    }
}
