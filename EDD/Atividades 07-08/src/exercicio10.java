import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.println("Informe o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.println("Informe a média final do aluno " + nome + ":");
            double media = scanner.nextDouble();
            scanner.nextLine();

            medias.add(media);
        }

        String alunoMaiorMedia = "";
        double maiorMedia = Double.MIN_VALUE;

        for (int i = 0; i < medias.size(); i++) {
            double mediaAtual = medias.get(i);
            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                alunoMaiorMedia = nomes.get(i);
            }
        }

        System.out.println("Aluno com maior média: " + alunoMaiorMedia);

        for (int i = 0; i < medias.size(); i++) {
            double mediaAtual = medias.get(i);
            if (mediaAtual < 7) {
                double notaNecessaria = 10.0 - mediaAtual;
                System.out.println("Aluno " + nomes.get(i) + " precisa tirar " + notaNecessaria +
                        " na prova de exame final para ser aprovado.");
            }
        }

        scanner.close();
    }
}