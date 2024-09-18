import javax.swing.JOptionPane;

//package Desafio01;

public class Desafio01 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero  % 2 == 0) {

            JOptionPane.showMessageDialog(null, "Número é PAR.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Número é IMPAR", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}
