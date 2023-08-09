import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        for (int i= 0; i< 5; i++)
        {
            System.out.println("Informe um número : ");
            int x = scan.nextInt();
            list.add(x);
        }
        int maior = list.get(0);
        int menor = list.get(0);
        int soma = list.get(0);

        for (int i = 1; i < list.size(); i++)
        {
            int elemento = list.get(i);
            if(elemento > maior)
            {
                maior = elemento;
            }
            if(elemento < menor)
            {
                menor = elemento;
            }
            soma += elemento;


        }

        double media = (double) soma / list.size();

        System.out.println("Elementos do ArrayList: " + list);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média dos valores: " + media);
    }
}