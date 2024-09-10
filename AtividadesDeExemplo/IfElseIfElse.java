import javax.swing.JOptionPane;

public class IfElseIfElse {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número informado é menor que Zero", "Se, Senão Se e Senão > If, Else If e Else",
            JOptionPane.INFORMATION_MESSAGE);
        } else if (numero == 0) {
            JOptionPane.showMessageDialog(null, "O número informado é igual a zero",
            "Se, Senão Se e Senão > If, Else If e Else",
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O número informado é maior que zero", 
            "Se, Senão Se e Senão > If, Else If e Else",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }   
}