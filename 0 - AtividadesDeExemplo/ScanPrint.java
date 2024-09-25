import javax.swing.JOptionPane;

public class ScanPrint {

    public static void main(String[] args) {
        String nome;

        nome = JOptionPane.showInputDialog("Informe seu nome:");

        JOptionPane.showMessageDialog(null, "Nome informado: " + nome,
            "Entrada e Saída > Scan e Print", JOptionPane.INFORMATION_MESSAGE);
    }
}