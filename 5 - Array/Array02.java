
import javax.swing.JOptionPane;


public class Array02 {
    public static void main(String[] args) {
        
        int numero[] = new int[5];
        int aux = 0;
    
        //lendo os valores do vetor
        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o elemento " + i+1));
        }
    
        //ordenação
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] > numero[j + 1]) {
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }
            }
        }
    
        //imprimindo valores do vetor ordenado
        for (int i = 0; i < numero.length; i++) {
            JOptionPane.showMessageDialog(null, "Valor da posição " + i+1 + " --> " + numero[i]);
    
        }
    }
}
