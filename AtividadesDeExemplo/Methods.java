
import javax.swing.JOptionPane;


public class Methods {
    public static void main(String[] args) {
        String nome = "";

        JOptionPane.showMessageDialog(null, "Este é um EXEMPLO de aplicação de um método", 
        "Método > Method", JOptionPane.INFORMATION_MESSAGE);

        nome = solicitaNome();

        informeNome(nome);
    }

    public static String solicitaNome(){
        String nome = "";

        nome = JOptionPane.showInputDialog("Informe seu nome: ");

        return nome;
    }

    public static void informeNome(String nome) {
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + "?",
            "Método > Method", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
