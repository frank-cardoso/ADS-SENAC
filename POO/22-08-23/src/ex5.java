import javax.swing.*;

public class ex5
{
    public static void main(String[] args) {


        Integer n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Primeiro Número :", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(n1);
        Integer n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo Número :", "Entrada", JOptionPane.QUESTION_MESSAGE));
        System.out.println(n2);

        try{
            int soma = n1 + n2;
            int sub =  n1 - n2;
            int divi = n1 / n2;
            int multi = n1 * n2;

            System.out.println(soma + " " + divi + " " + multi + " " + sub);

        } catch (ArithmeticException e) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }

    }
}