
import javax.swing.JOptionPane;


public class Array01 {
    public static void main(String[] args) {

        Double media = 0.0;
        int numero[] = new int[10];
        int total = 0;

        int maior = 0;
        int menor = 0;
        
        JOptionPane.showMessageDialog(null, "Informe 10 números inteiros para calcularmos a média.");

        for(int i=0; i < 10; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o "+(i+1)+"° número: "));
            
            total += numero[i];
            if (menor == 0) {
                menor = numero[i];
            }

            if(numero[i] < menor) {
                numero[i] =  menor;

            } else if(numero[i] >  maior) {
                maior = numero[i];

            }
        }

        media = (double) total / 10;

        JOptionPane.showMessageDialog(null, "Média: "+media);
        JOptionPane.showMessageDialog(null, "Menor número: "+menor);
        JOptionPane.showMessageDialog(null, "Maior número: "+maior);
    }
}
