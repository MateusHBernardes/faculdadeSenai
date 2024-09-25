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

            case 3:
            int lado1[] = new int [2];
            
            for (int i=0;i<2;i++){
                lado1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado do retângulo"));
                
                int resultado2 = lado1[0] * lado1[1];
                JOptionPane.showMessageDialog(null, "Área: "+ resultado2);
            }
            break;

            case 4:
            int cateto[] = new int [2];
            for (int i = 0; i < 2; i++){
                cateto[i] = Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite o " + (i+1) + "° cateto: "));

                int resultado3 = (cateto[0]  * cateto[1]) / 2;
                JOptionPane.showMessageDialog(null, "Área: "+ resultado3);
            }
            

        }
    }
}