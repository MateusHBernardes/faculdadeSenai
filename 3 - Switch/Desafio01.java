import javax.swing.*;
public class Desafio01 {
    public static void main(String[] args) {

        int option = Integer.parseInt(JOptionPane.showInputDialog("1 - Círculo\n2 - Quadrado\n3 - Retângulo \n4 - Triângulo"));

        while (option >= 5 ||  option <= 0) {


            JOptionPane.showMessageDialog(null, "Valor inválido");

            option = Integer.parseInt(JOptionPane.showInputDialog("Informe outra opção:"));
        }

        switch(option){
            case 1:
                Double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio do círculo"));

                Double resultado = 3.14 * (raio * raio);

                JOptionPane.showMessageDialog(null, "Área: "+resultado);
                break;
            
            case 2:
                Double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do quadrado"));

                Double resultado1 =  lado * lado;

                JOptionPane.showMessageDialog(null, "Área: "+resultado1);

                break;

            case 3: // Retângulo
                Double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do retângulo"));
                Double largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do retângulo"));
                Double areaRetangulo = comprimento * largura;
                JOptionPane.showMessageDialog(null, "Área do retângulo: " + areaRetangulo);
                break;

            case 4:
                Double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo"));
                Double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo"));

                Double resultado3 = (base * altura) / 2;
                JOptionPane.showMessageDialog(null, "Área: "+ resultado3);

            default:
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}