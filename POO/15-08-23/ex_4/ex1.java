import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o Nome :", "Entrada", JOptionPane.QUESTION_MESSAGE);
        System.out.println(nome);

        String sobrenome = JOptionPane.showInputDialog(null, "Digite o Sobrenome :", "Entrada", JOptionPane.QUESTION_MESSAGE);
        System.out.println(sobrenome);
        
        String resultado = ""+nome +" "+sobrenome;
        JOptionPane.showMessageDialog(null, "Esse é o seu nome completo :"+resultado , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}