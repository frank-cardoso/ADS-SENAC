import java.util.ArrayList;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> codigosProdutos = new ArrayList<>();
        ArrayList<Integer> estoqueProdutos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o código do produto " + (i + 1) + ":");
            int codigoProduto = scanner.nextInt();
            codigosProdutos.add(codigoProduto);

            System.out.println("Informe o estoque do produto " + (i + 1) + ":");
            int estoqueProduto = scanner.nextInt();
            estoqueProdutos.add(estoqueProduto);
        }

        int codigoCliente;
        while (true) {
            System.out.println("Informe o código do cliente (ou 0 para sair):");
            codigoCliente = scanner.nextInt();
            if (codigoCliente == 0) {
                break;
            }

            System.out.println("Informe o código do produto que deseja comprar:");
            int codigoProduto = scanner.nextInt();

            System.out.println("Informe a quantidade desejada:");
            int quantidadeDesejada = scanner.nextInt();

            int indiceProduto = codigosProdutos.indexOf(codigoProduto);

            if (indiceProduto == -1) {
                System.out.println("Código inexistente");
            } else if (estoqueProdutos.get(indiceProduto) >= quantidadeDesejada) {
                System.out.println("Pedido atendido. Obrigado e volte sempre.");
                estoqueProdutos.set(indiceProduto, estoqueProdutos.get(indiceProduto) - quantidadeDesejada);
            } else {
                System.out.println("Não temos estoque suficiente dessa mercadoria.");
            }
        }

        System.out.println("Estoque atualizado:");
        for (int i = 0; i < codigosProdutos.size(); i++) {
            System.out.println("Código: " + codigosProdutos.get(i) + " - Estoque: " + estoqueProdutos.get(i));
        }

        scanner.close();
    }
}