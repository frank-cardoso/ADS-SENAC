import java.util.ArrayList;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int[] x = new int[6];
        int par = 0;
        int impar = 0;

        for (int i=0;i<6;i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            x[i] = scan.nextInt();
        }
        System.out.println("Números pares:");
        for (int i = 1; i <6; i++) {
            if (x[i]% 2==0){
                System.out.print(x[i] + " ");
                par++;
            }
        }
        System.out.println("\nQuantidade de números pares: " + par);

        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < 6; i++) {
            if (x[i] % 2 != 0) {
                System.out.print(x[i] + " ");
                impar++;
            }
        }

        System.out.println("\nQuantidade de números ímpares: " + impar);

        scan.close();
    }
}