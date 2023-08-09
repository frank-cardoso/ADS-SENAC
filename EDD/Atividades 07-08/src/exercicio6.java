import java.util.ArrayList;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i< 5; i++)
        {
            System.out.println("Informe um número : ");
            int x = scan.nextInt();
            A.add(x);
        }

        for (int i = A.size() -1; i >= 0; i--)
        {
            B.add(A.get(i));
        }
        System.out.println("Elementos do Vetor A : ");
        for (int x : A)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : B)
        {
            System.out.print(x + " ");
        }
        scan.close();
    }
}