import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int[] X = {7, 21, 15, 12, 82};
        int num;
        boolean achou = false;

        System.out.print("Qual o numero deseja procurar?");
        num = scan.nextInt();

        for(int i=0;i<5;i++){
            if(X[i]==num){
                System.out.println("Encontrado na posição:"+i);
                achou = true;
            }
        }
        if(!achou){
            System.out.println("O número não está no vetor.");
        }

        scan.close();
    }
}