import javax.swing.JOptionPane;

public class For {
    public static void main(String[] args) {
        String textoFinal = "";

        JOptionPane.showMessageDialog(null, "Você dirá suas 3 bandas preferidas",
            "Para (ou Para Faça) > For", JOptionPane.INFORMATION_MESSAGE);
    
        for (int i = 0; i < 3; i++) {
            textoFinal += JOptionPane.showInputDialog("Informe o nome da sua 1° banda preferida:");
            textoFinal += "\n";
        }

        JOptionPane.showMessageDialog(null, "Suas bandas preferidas são"+ textoFinal,
            "Para (ou Para Faça) > For", JOptionPane.INFORMATION_MESSAGE);
        }
}
