public class EX2 {
//    Atividade 2
    public static void main(String[] args) {

        System.out.println("Imprimir o dia da semana correspondente");

        int dia = 4;

        switch (dia){
            case 1 :
                System.out.println("Segunda");
                break;
            case 2 :
                System.out.println("Terça");
                break;
            case 3 :
                System.out.println("Quarta");
                break;
            case 4 :
                System.out.println("Quinta");
                break;
            case 5 :
                System.out.println("Sexta");
                break;
            case 6 :
                System.out.println("Sábado");
                break;
            case 7 :
                System.out.println("Domingo");
                break;
            default :
                System.out.println("Dia inválido");
                break;
        }
        System.out.println("Imprimir o valor de x, começando com o valor 10");
        byte i = 0;
        byte x = 10;
        while(i <= 20) {
            System.out.println(x);
            x++;
            i++;
        }


        System.out.println("Ex anterior usando do while");

        i = 0;
        x = 10;
        do{
            System.out.println(x);
            x++;
            i++;
        }while (i <= 20);

        System.out.println("Calcular a área de um trapezio");

        int h = 1; // altura
        int b = 2; // base menor
        int B = 5; // base maior Área

        double area = (h *(b + B))/2;
        System.out.println("Área : " + area);



    }
}