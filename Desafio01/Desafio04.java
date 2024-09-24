
import javax.swing.JOptionPane;


public class Desafio04 {
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Informe uma palavra: \n");
        
        int resultado = texto.length();

        JOptionPane.showMessageDialog(null, "Seu texto tem " + resultado + " letras");

    }
    
}
