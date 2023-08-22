import java.util.Stack;

public class pilha2 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Pilha Original" + stack);

        Stack<Integer> stackInverse = new Stack<>();

        while(!stack.isEmpty())
        {
            stackInverse.push(stack.pop());
        }

        System.out.println(stackInverse);

        stack = stackInverse;

        System.out.println("Pilha invertida: " + stack);
    }
}
