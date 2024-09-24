
import javax.swing.JOptionPane;


public class Desafio01 {
    public static void main(String[] args) {

        String string = JOptionPane.showInputDialog("Informe sua idade: ");
                
        int idade =  Integer.parseInt(string);

        if (idade <= 18) {
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idade >= 18 && idade <= 30) {
            JOptionPane.showMessageDialog(null, "Jovem");
        } if (idade  >= 30 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto"); 
        } else if (idade >= 60) {
            JOptionPane.showMessageDialog(null, "Idoso");
        }
    }
}