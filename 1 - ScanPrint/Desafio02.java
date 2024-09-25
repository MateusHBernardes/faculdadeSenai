import javax.swing.*;

public class Desafio02 {
     public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Informe um número real: ");

        Double resposta = Double.parseDouble(numero); //Double é uma classe  que representa um número real


        long arredondar = Math.round(resposta); //Long é  uma classe que representa um número inteiro
         
        JOptionPane.showMessageDialog(null, "Seu resultado é: "+arredondar+"!");

    }
}