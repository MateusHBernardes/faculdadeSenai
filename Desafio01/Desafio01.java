import javax.swing.JOptionPane;

public class Desafio01 { //função programa
    public static void main(String[] args) { //função inicio
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero  % 2 == 0) {

            JOptionPane.showMessageDialog(null, "Número é PAR.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Número é IMPAR", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
}
