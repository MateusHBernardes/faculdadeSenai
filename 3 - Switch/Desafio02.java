import javax.swing.*;

public class Desafio02 {
    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog("introduza a letra:");

        // Verificar se o usuário digitou apenas um caractere
        if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
            JOptionPane.showMessageDialog(null, "Caractere inválido!");
            
        } else {
            // Converter a letra para minúscula para evitar problemas com maiúsculas
            letra = letra.toLowerCase();
        
            switch(letra){

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                JOptionPane.showMessageDialog(null, "Vogal");
                break;

            default:
            JOptionPane.showMessageDialog(null, "Consoante");
            }
        }
    }
}
