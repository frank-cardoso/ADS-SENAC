import java.util.Stack;

import java.util.Scanner;

    public class pilha1 {

    public static void main(String[] args) {

        Stack<Integer> P1 = new Stack<>();

        Stack<Integer> P2 = new Stack<>();

        Stack<Integer> tempStack = new Stack<>();

        Scanner scan =new Scanner(System.in);



        // Adicionar elementos à pilha P1

        for(int i=0;i<5;i++){

            System.out.print("Informe um número: ");

            int x= scan.nextInt();

            P1.push(x);



        }



        System.out.println("A PILHA P1 FICOU ASSIM");

        System.out.println(P1);

        System.out.println("\nVAMOS INICIAR A TRANSFERÊNCIA DE P1 PARA P2");





        // Transferir elementos de P1 para P2

        while (!P1.isEmpty()) {

            tempStack.push(P1.pop());

        }

        while (!tempStack.isEmpty()) {

            int element = tempStack.pop();

            P1.push(element);

            P2.push(element);

        }



        // Mostrar a pilha P1

        System.out.println("Pilha P1 após transferência:");

        System.out.println(P1);



        // Mostrar a pilha P2

        System.out.println("Pilha P2 após transferência:");

        System.out.println(P2);

    }

}