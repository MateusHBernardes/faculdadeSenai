import javax.swing.*;
public class Desafio01 {
    public static void main(String[] args) {

        int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Círculo\n2 - Quadrado\n3 - Retângulo retângulo\n4 - Triângulo"));

        switch(option){
            case 1:
                int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio do círculo"));

                int resultado = 3 * (raio * raio);

                JOptionPane.showMessageDialog(null, "Área: "+resultado);
                break;
            
            case 2:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do quadrado"));

                int resultado1 =  lado * lado;

                JOptionPane.showMessageDialog(null, "Área: "+resultado1);

                break;

            case 3: // Retângulo
                int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do retângulo"));
                int largura = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do retângulo"));
                int areaRetangulo = comprimento * largura;
                JOptionPane.showMessageDialog(null, "Área do retângulo: " + areaRetangulo);
                break;

            case 4:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do triângulo"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triângulo"));

                int resultado3 = (base * altura) / 2;
                JOptionPane.showMessageDialog(null, "Área: "+ resultado3);

        }
    }
}