import javax.swing.JOptionPane;

public class Desafio02 {
public static void main(String[] args) {

int valores[] = new int [3];

for (int i = 0; i < 3; i++) {
    valores[i] = Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite o " + (i+1) + "° valor: ")) ;

    }

    if (valores[0] != valores[1] &&  valores[0] != valores[2] && valores[1] != valores[2]) {
        JOptionPane.showMessageDialog(null, "Triângulo escaleno");

        } else if (valores[0] == valores[1] && valores[0] != valores[2] || valores[1] == valores[2] && valores[1] != valores[0] ||  valores[0] == valores[2] && valores[0] != valores[1]) {

        JOptionPane.showMessageDialog(null, "Triângulo isósceles");

        } else if (valores[0] == valores[1] &&  valores[0] == valores[2] && valores[1] == valores[2]) {
        JOptionPane.showMessageDialog(null, "Triângulo equilátero");

        } else {    
        JOptionPane.showMessageDialog(null, "Impossível");
        }
    }

}