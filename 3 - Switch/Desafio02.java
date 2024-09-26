import javax.swing.*;

public class Desafio02 {
    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog("introduza a letra:");

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
