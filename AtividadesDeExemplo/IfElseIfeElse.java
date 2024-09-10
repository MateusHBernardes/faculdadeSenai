import javax.swing.JOptionPane;

public class ScanPrint {

    public static void main(String[] args) {
        int numero;

        numero = Interg.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número informado é menor que Zero", "Se, Senão Se e Senão > If, Else If e Else",
            JOptionPane.INFORMATION_MESSAGE);
        } else if (numero == 0) {
            JOptionPane.showMessageDialog(null, args, null, numero);
        }
    }

    
}