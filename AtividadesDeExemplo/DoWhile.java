import javax.swing.JOptionPane;

public class DoWhile {
    public static void main(String[] args) {
        Double resposta = 0.0;

        JOptionPane.showMessageDialog(null, "Acerte o cálculo",
            "Faça Enquanto > Do While", JOptionPane.INFORMATION_MESSAGE);
    
        do { 
            resposta = Double.parseDouble(JOptionPane.showInputDialog("Quanto é 5 / 2"));
        } while (resposta != 2.5);

        JOptionPane.showMessageDialog(null, "Aê! Você acertou!",
            "Para (ou Para Faça) > For", JOptionPane.INFORMATION_MESSAGE);
        }
} 