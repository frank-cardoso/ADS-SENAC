import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<Integer> vetorA = new ArrayList<>();
            ArrayList<Integer> vetorT = new ArrayList<>();

            System.out.println("Digite 5 números: ");
            for (int i = 0; i < 5; i++) {
                int numero = scan.nextInt();
                vetorA.add(numero);
            }

            for (int i = 0; i < vetorA.size(); i++) {
                int triplo = vetorA.get(i) * 3;
                vetorT.add(triplo);
            }

            System.out.println("O triplo dos valores informados é: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(vetorT.get(i));
            }
        }
    }
}