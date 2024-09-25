import javax.swing.JOptionPane;

public class Desafio01 {
    public static void main(String[] args) {
       
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        while (idade < 0) {

            JOptionPane.showMessageDialog(null, "Valor inválido");

            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        }

        if (idade <= 18) { 
            JOptionPane.showMessageDialog(null, "Criança");
        } else if (idade >= 19 && idade <= 29) {
            JOptionPane.showMessageDialog(null, "Jovem");
        } if (idade  >= 30 && idade <= 59) {
            JOptionPane.showMessageDialog(null, "Adulto"); 
        } else if (idade >= 60) {
            JOptionPane.showMessageDialog(null, "Idoso");
        }
    }
}