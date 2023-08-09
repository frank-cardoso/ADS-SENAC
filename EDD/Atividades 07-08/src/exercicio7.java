import java.util.ArrayList;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<Double> novosSalarios = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Digite o salário da pessoa " + (i + 1) + ":");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            salarios.add(salario);
            novosSalarios.add(salario * 1.08);
        }

        System.out.println("Listagem de nomes e novos salários:");
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + ". Nome: " + nomes.get(i) + " - Novo Salário: " + novosSalarios.get(i));
        }

        scanner.close();
    }
}