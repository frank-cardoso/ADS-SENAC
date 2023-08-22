import javax.swing.*;

public class tarefa3 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Digite o numero correspondente a cada dia da semana :", "Entrada", JOptionPane.QUESTION_MESSAGE);
        System.out.println(numero);
        int dia = Integer.parseInt(numero);

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Segunda-feira", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Terça-feira", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quarta-feira", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quinta-feira", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Sexta-feira", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia Invalido", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}