
public class ex6 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int numero : numeros)
        {
            if (numero > maior)
            {
                maior = numero;
            }
            if (numero < menor)
            {
                menor = numero;
            }

            soma += numero;

        }

        double media = soma / numeros.length;

        System.out.println("O maior número do Array é : " + maior);
        System.out.println("O menor número do Array é : " + menor);
        System.out.println("A media dos números do Array é : " + media);

        System.out.println("Números pares do Array :");
        for (int numero : numeros)
        {
            if(numero % 2 == 0)
            {
                System.out.println(numero);
            }
        }
    }
}
