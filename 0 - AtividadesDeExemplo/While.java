import javax.swing.JOptionPane;

public class While {
    public static void main(String[] args) {
        boolean resposta;
        int auxiliar;

        JOptionPane.showMessageDialog(null, "Conta uma coisa pra gente...",
            "Enquanto > While", JOptionPane.INFORMATION_MESSAGE);

            auxiliar = JOptionPane.showConfirmDialog(null, "Você entendeu a diferença de Do While e While?",
                "Fala a verdade", JOptionPane.YES_NO_OPTION);

        if (auxiliar == 0) {
            resposta = true;
        }  else {
            resposta = false;
        }

        while (!resposta) {
            auxiliar = JOptionPane.showConfirmDialog(null, "Pô, para de brincar com a gente?", 
                "Fala a verdade", JOptionPane.YES_NO_OPTION);

            if (auxiliar == 0) {
                resposta = true;
            } else {
                resposta = false;
            }
        }

        JOptionPane.showMessageDialog(null, "ISSAÊ!!!",
            "Enquanto > While", JOptionPane.INFORMATION_MESSAGE);
    }
}
