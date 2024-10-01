import java.util.*;
import javax.swing.JOptionPane;

public class Array02 {
    public static void main(String[] args) {

        int numero[] = new int[5];

        JOptionPane.showMessageDialog(null, "Informe 5 números inteiros para calcularmos a média.");

        for(int i=0; i < 5; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o "+(i+1)+"° número: "));
                   
        }

        Arrays.sort(numero);

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Resultado: "+numero[i]);

        }

    }
}
