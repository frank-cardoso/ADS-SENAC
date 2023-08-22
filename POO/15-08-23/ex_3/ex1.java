
public class ex1 {
    public static void main (String[] args) {
        String frase = "Qualquer frase";
        
        if(frase.length() < 50) {
            System.out.println("'" + frase + "'" + " é uma frase curta");
        } else {
            System.out.println("'" + frase + "'" + " é uma frase longa");
        }
    }
}