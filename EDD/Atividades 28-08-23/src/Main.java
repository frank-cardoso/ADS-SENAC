import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> listaContatos = new LinkedList<>();
        Queue<Integer> filaChamada = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar o contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Realizar chamada");
            System.out.println("4 - Sair");

            int escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite o número do telefone do contato: ");
                    Integer numeroTelefone = scan.nextInt();
                    listaContatos.add(nome);
                    filaChamada.add(Integer.parseInt(String.valueOf(numeroTelefone)));
                    break;
                case 2:
                    System.out.println("\nLista de Contatos:");
                    for (String contato : listaContatos) {
                        System.out.println("Nome: " + contato);
                    }
                    break;
                case 3:
                    if (!filaChamada.isEmpty()) {
                        int numeroChamada = filaChamada.peek();
                        System.out.println("Realizando chamada para número: " + numeroChamada);
                        filaChamada.remove();
                    } else {
                        System.out.println("Nenhuma chamada pendente.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scan.close();
                    return;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
