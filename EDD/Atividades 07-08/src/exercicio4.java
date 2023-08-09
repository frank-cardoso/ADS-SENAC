import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vetorA = new ArrayList<>();

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            vetorA.add(numero);
        }

        int primeiroNegativoIndex = -1;

        for (int i = 0; i < vetorA.size(); i++) {
            if (vetorA.get(i) < 0) {
                primeiroNegativoIndex = i;
                break;
            }
        }

        if (primeiroNegativoIndex != -1) {
            System.out.println("Índice do primeiro número negativo: " + primeiroNegativoIndex);
        } else {
            System.out.println("Negativo não encontrado");
        }

        scanner.close();
    }
}