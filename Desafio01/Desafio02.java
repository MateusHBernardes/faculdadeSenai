import javax.swing.*;

public class Desafio02 {
     public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Informe um número real: ");

        Double resposta = Double.parseDouble(numero);

        long arredondar = Math.round(resposta);
        
        JOptionPane.showMessageDialog(null, "Seu resultado é: "+arredondar+"!");

    }
}