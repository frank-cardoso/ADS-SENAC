import java.util.Stack;

public class pilha3 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        stack2.push(5);
        stack2.push(10);
        stack2.push(15);

        boolean seIguais = iguais(stack, stack2);

        if (seIguais)
        {
            System.out.println("As stack 1 e 2 são iguais");
        }else {
            System.out.println("As stacks 1 e 2 não são iguais.");
        }

        boolean iguais(Stack<Integer> stack, Stack<Integer> stack2) {
            if (stack.size() != stack2.size()) {
                return false;
            }

            while (!stack.isEmpty()) {
                int elementoP1 = stack.pop();
                int elementoP2 = stack2.pop();

                if (elementoP1 != elementoP2) {
                    return false;
                }
            }

            return true;

    }
}
