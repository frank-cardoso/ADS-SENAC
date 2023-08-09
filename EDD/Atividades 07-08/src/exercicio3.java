import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<5;i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int x= scan.nextInt();
            list.add(x);
        }
        int maior = list.get(0);
        int menor = list.get(0);
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < list.size(); i++) {
            int valorA = list.get(i);
            if (valorA > maior) {
                maior = valorA;
                posicaoMaior = i;
            }

            if (valorA < menor) {
                menor = valorA;
                posicaoMenor = i;
            }
        }

        int diferenca = maior - menor;

        System.out.println("\nDiferença: ");
        System.out.println(diferenca);
        System.out.println("\nMaior valor: " + maior + " (Posição: " + posicaoMaior + ")");
        System.out.println("Menor valor: " + menor + " (Posição: " + posicaoMenor + ")");

    }
}